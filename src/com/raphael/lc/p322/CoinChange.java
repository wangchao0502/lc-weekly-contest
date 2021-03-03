package com.raphael.lc.p322;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-03-03 11:13:36
 */
class CoinChange {
    /**
     * Description for CoinChange:
     * 零钱兑换
     */
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;

        // dp[i]表示兑换零钱i需要的最少金币数
        int n = coins.length;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
