package com.raphael.lc.offer14;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-03-13 14:01:04
 */
class CuttingRope {
    /**
     * Description for CuttingRope:
     * 剪绳子
     */
    public int cuttingRope(int n) {
        // code
        // 减长度为i的绳子的最大乘积
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 1);

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(Math.max(dp[i], dp[i - j] * j), (i - j) * j);
            }
        }

        return dp[n];
    }
}
