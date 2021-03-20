package com.raphael.lc.biweekly48.p5712;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-03-20 22:53:15
 */
class GetMaximumConsecutive {
    /**
     * Description for GetMaximumConsecutive:
     * 你能够造出连续值的最大数目
     */
    public int getMaximumConsecutive(int[] coins) {
        // code
        int n = coins.length;
        Arrays.sort(coins);

        int[] dp = new int[n + 1];

        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            if (coins[i] <= dp[i] + 1) {
                dp[i + 1] = dp[i] + coins[i];
            } else {
                return dp[i] + 1;
            }
        }

        return dp[n] + 1;
    }
}
