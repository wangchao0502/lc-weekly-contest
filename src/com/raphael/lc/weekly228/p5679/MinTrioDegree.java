package com.raphael.lc.weekly228.p5679;

/**
 * @author raphael
 * @date 2021-02-14 10:42:03
 */
class MinTrioDegree {
    /**
     * Description for MinTrioDegree:
     * 一个图中连通三元组的最小度数
     */
    public int minTrioDegree(int n, int[][] edges) {
        // code
        boolean[][] d = new boolean[n][n];
        int[] deg = new int[n];
        for (int[] edge : edges) {
            d[edge[0] - 1][edge[1] - 1] = d[edge[1] - 1][edge[0] - 1] = true;
            deg[edge[0] - 1]++;
            deg[edge[1] - 1]++;
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (!d[i][j]) {
                    continue;
                }
                for (int k = j + 1; k < n; k++) {
                    if (d[i][k] && d[j][k]) {
                        ans = Math.min(ans, deg[i] + deg[j] + deg[k] - 6);
                    }
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
