package com.raphael.lc.p1703;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-04-07 11:16:53
 */
class MinMoves {
    /**
     * Description for MinMoves:
     * 得到连续K个1的最少相邻交换次数
     */
    public int minMoves(int[] nums, int k) {
        // code
        int n = nums.length;
        List<Long> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) list.add((long) (i - list.size() - 1));
        }
        long[] sum = new long[list.size() + 1];
        for (int i = 1; i <= list.size(); i++) {
            sum[i] = sum[i - 1] + list.get(i - 1);
        }
        long min = Long.MAX_VALUE;
        for (int i = 0; i + k - 1 < list.size(); i++) {
            int j = i + k - 1;
            int mid = i + j >> 1;
            long left = list.get(mid) * (mid - i) - (sum[mid] - sum[i]);
            long right = sum[j + 1] - sum[mid + 1] - (j - mid) * list.get(mid);
            min = Math.min(min, left + right);
        }
        return (int) min;
    }
}
