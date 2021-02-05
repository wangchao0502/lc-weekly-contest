package com.raphael.lc.p63;

/**
 * @author raphael
 * @date 2021-02-05 16:09:41
 */
class UniquePathsWithObstacles {
    /**
     * Description for UniquePathsWithObstacles:
     * 不同路径II
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // code
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        dp[0][0] = obstacleGrid[0][0] ^ 1;

        // init
        for (int i = 1; i < n; i++) {
            dp[0][i] = obstacleGrid[0][i] == 1 ? 0 : dp[0][i - 1];
        }
        for (int i = 1; i < m; i++) {
            dp[i][0] = obstacleGrid[i][0] == 1 ? 0 : dp[i - 1][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
}
