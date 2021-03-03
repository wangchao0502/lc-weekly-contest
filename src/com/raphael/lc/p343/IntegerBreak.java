package com.raphael.lc.p343;

/**
 * @author Raphael
 * @date 2021-03-03 11:33:38
 */
class IntegerBreak {
    /**
     * Description for IntegerBreak:
     * 整数拆分
     */
    public int integerBreak(int n) {
        // 2<=n<=58
        int[] dp = new int[n + 1];
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max((i - j) * j, Math.max(dp[i - j] * j, dp[i]));
            }
        }

        return dp[n];
    }
}
