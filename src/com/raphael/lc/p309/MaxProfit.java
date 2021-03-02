package com.raphael.lc.p309;

/**
 * @author Raphael
 * @date 2021-03-02 07:58:36
 */
class MaxProfit {
    /**
     * Description for MaxProfit:
     * 最佳买卖股票时机含冷冻期
     */
    public int maxProfit(int[] prices) {
        // code
        int n = prices.length;
        if (n == 0) {
            return 0;
        }

        // dp[i][0]第i天持有股票，dp[i][1]第i天冻结，dp[i][2]第i天不持有且不冷冻的最大利润
        int[][] dp = new int[n][3];
        dp[0][0] = -prices[0];

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] - prices[i]);
            dp[i][1] = dp[i - 1][0] + prices[i];
            dp[i][2] = Math.max(dp[i - 1][1], dp[i - 1][2]);
        }

        return Math.max(dp[n - 1][1], dp[n - 1][2]);
    }
}
