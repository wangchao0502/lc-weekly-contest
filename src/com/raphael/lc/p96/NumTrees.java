package com.raphael.lc.p96;

/**
 * @author raphael
 * @date 2021-02-10 13:37:41
 */
class NumTrees {
    /**
     * Description for NumTrees:
     * 不同的二叉搜索树
     */
    public int numTrees(int n) {
        // code
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
