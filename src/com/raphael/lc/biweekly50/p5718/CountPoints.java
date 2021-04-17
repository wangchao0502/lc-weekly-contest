package com.raphael.lc.biweekly50.p5718;

/**
 * @author Raphael
 * @date 2021-04-17 23:11:57
 */
class CountPoints {
    /**
     * Description for CountPoints:
     * 统计一个圆中点的数目
     */
    private boolean contains(int[] p1, int[] p2, int r) {
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]) <= r * r;
    }

    public int[] countPoints(int[][] points, int[][] queries) {
        // code
        int n = queries.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int[] query = queries[i];
            int count = 0;
            for (int[] point : points) {
                if (contains(point, new int[]{query[0], query[1]}, query[2])) {
                    count++;
                }
            }
            ans[i] = count;
        }

        return ans;
    }
}
