package com.raphael.lc.weekly236.p5728;

/**
 * @author Raphael
 * @date 2021-04-11 10:58:49
 */
class MinSideJumps {
    /**
     * Description for MinSideJumps:
     * 最少侧跳次数
     */
    public int minSideJumps(int[] obstacles) {
        // code
        int n = obstacles.length;
        int[][] dp = new int[n][4];

        int maxJump = 1000000;
        dp[0][1] = 1;
        dp[0][3] = 1;

        for (int i = 1; i < n; i++) {
            if (obstacles[i] == 0) {
                dp[i][1] = Math.min(dp[i - 1][1], Math.min(dp[i - 1][2] + 1, dp[i - 1][3] + 1));
                dp[i][2] = Math.min(dp[i - 1][2], Math.min(dp[i - 1][3] + 1, dp[i - 1][1] + 1));
                dp[i][3] = Math.min(dp[i - 1][3], Math.min(dp[i - 1][2] + 1, dp[i - 1][1] + 1));
            } else if (obstacles[i] == 1) {
                dp[i][1] = maxJump;
                dp[i][2] = Math.min(dp[i - 1][2], dp[i - 1][3] + 1);
                dp[i][3] = Math.min(dp[i - 1][3], dp[i - 1][2] + 1);
            } else if (obstacles[i] == 2) {
                dp[i][1] = Math.min(dp[i - 1][1], dp[i - 1][3] + 1);
                dp[i][2] = maxJump;
                dp[i][3] = Math.min(dp[i - 1][3], dp[i - 1][1] + 1);
            } else {
                dp[i][1] = Math.min(dp[i - 1][1], dp[i - 1][2] + 1);
                dp[i][2] = Math.min(dp[i - 1][2], dp[i - 1][1] + 1);
                dp[i][3] = maxJump;
            }
        }

        return Math.min(dp[n - 1][1], Math.min(dp[n - 1][2], dp[n - 1][3]));
    }
}
