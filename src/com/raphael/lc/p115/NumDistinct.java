package com.raphael.lc.p115;

/**
 * @author Raphael
 * @date 2021-03-17 09:55:59
 */
class NumDistinct {
    /**
     * Description for NumDistinct:
     * 不同的子序列
     */
    public int numDistinct(String s, String t) {
        // code
        int n = t.length();
        int m = s.length();
        // t[i],s[j]匹配的序列数量
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i < m; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (t.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }

        return dp[n][m];
    }
}
