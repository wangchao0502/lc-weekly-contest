package com.raphael.lc.biweekly51.p5733;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-05-01 23:24:19
 */
class ClosestRoom {
    /**
     * Description for ClosestRoom:
     * 最近的房间
     */
    private int lowerBound(int[][] rooms, int target, int id) {
        // code
        int left = 0, right = rooms.length;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (rooms[mid][1] < target) left = mid + 1;
            else right = mid;
        }
        // 返回数组中第一个大于等于target的下标位置
        // 如果在没有target的时候返回-1，添加如下两行代码
        if (left == rooms.length) return -1;

        // 找到最接近的id
        int minDelta = Math.abs(id - rooms[left][0]);
        int ans = rooms[left][0];

        for (int i = left + 1; i < rooms.length; i++) {
            int delta = Math.abs(rooms[i][0] - id);
            if (delta <= minDelta) {
                ans = delta == minDelta ? Math.min(rooms[i][0], ans) : rooms[i][0];
                minDelta = delta;
            }
        }

        return ans;
    }

    public int[] closestRoom(int[][] rooms, int[][] queries) {
        // code
        int n = queries.length;
        int[] ans = new int[n];

        Arrays.sort(rooms, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        for (int i = 0; i < n; i++) {
            int[] query = queries[i];
            int id = query[0];
            int minSize = query[1];
            ans[i] = lowerBound(rooms, minSize, id);
        }

        return ans;
    }
}
