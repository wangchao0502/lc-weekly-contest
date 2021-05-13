package com.raphael.lc.p1269;

/**
 * @author Raphael
 * @date 2021-05-13 10:42:38
 */
class NumWays {
    /**
     * Description for NumWays:
     * 停在原地的方案数
     */
    public int numWays(int steps, int arrLen) {
        // code
        // 第i次停留在j位置的方案数
        int mod = 1000000007;
        int maxColumn = Math.min(arrLen - 1, steps);
        int[] dp = new int[maxColumn + 1];
        dp[0] = 1;
        for (int i = 1; i <= steps; i++) {
            int[] dpNext = new int[maxColumn + 1];
            for (int j = 0; j <= maxColumn; j++) {
                dpNext[j] = dp[j];
                if (j - 1 >= 0) {
                    dpNext[j] = (dpNext[j] + dp[j - 1]) % mod;
                }
                if (j + 1 <= maxColumn) {
                    dpNext[j] = (dpNext[j] + dp[j + 1]) % mod;
                }
            }
            dp = dpNext;
        }
        return dp[0];
    }
}

