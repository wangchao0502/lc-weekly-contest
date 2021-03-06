package com.raphael.lc.biweekly47.p5680;

/**
 * @author Raphael
 * @date 2021-03-06 22:31:48
 */
class NearestValidPoint {
    /**
     * Description for NearestValidPoint:
     * 找到最近的有相同X或Y坐标的点
     */
    private int distance(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }

    public int nearestValidPoint(int x, int y, int[][] points) {
        // code
        int minDistance = Integer.MAX_VALUE;
        int ans = -1;
        int[] target = {x, y};
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            if (point[0] == x || point[1] == y) {
                int dis = distance(point, target);
                if (dis < minDistance) {
                    minDistance = dis;
                    ans = i;
                }
            }
        }
        return ans;
    }
}
