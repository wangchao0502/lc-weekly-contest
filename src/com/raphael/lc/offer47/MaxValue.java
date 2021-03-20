package com.raphael.lc.offer47;

/**
 * @author Raphael
 * @date 2021-03-20 11:57:59
 */
class MaxValue {
    /**
     * Description for MaxValue:
     * 礼物的最大价值
     */
    public int maxValue(int[][] grid) {
        // code
        if (grid.length == 0 || grid[0].length == 0) return 0;

        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[0][0] = grid[0][0];
                } else if (i == 0) {
                    dp[0][j] = dp[0][j - 1] + grid[0][j];
                } else if (j == 0) {
                    dp[i][0] = dp[i - 1][0] + grid[i][0];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}
