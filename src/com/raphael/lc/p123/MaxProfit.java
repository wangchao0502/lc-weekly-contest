package com.raphael.lc.p123;

/**
 * @author raphael
 * @date 2021-01-09 16:11:23
 */
class MaxProfit {
    /**
     * Description for MaxProfit:
     * 给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
     * 设计一个算法来计算你所能获取的最大利润。你最多可以完成两笔交易。
     * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
     */
    public int maxProfit(int[] prices) {
        // code
        // 由于最多完成两笔交易，在任意一天结束会有5种状态
        // 1. do nothing
        // 2. buy once
        // 3. make deal once
        // 4. make deal once, and buy -> must be best answer
        // 5. make deal twice
        int len = prices.length;
        // recors four state except 1 -> do nothing
        // 第i天，在某种状态下的最大收益
        int[][] dp = new int[len][4];

        // init
        dp[0] = new int[]{-prices[0], 0, -prices[0], 0};

        for (int i = 1; i < len; i++) {
            // 状态转移方程
            dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);
            dp[i][1] = Math.max(dp[i - 1][0] + prices[i], dp[i - 1][1]);
            dp[i][2] = Math.max(dp[i - 1][1] - prices[i], dp[i - 1][2]);
            dp[i][3] = Math.max(dp[i - 1][2] + prices[i], dp[i - 1][3]);
        }

        return dp[len - 1][3];
    }
}
