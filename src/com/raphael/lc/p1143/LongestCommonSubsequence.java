package com.raphael.lc.p1143;

/**
 * @author Raphael
 * @date 2021-04-03 12:50:49
 */
class LongestCommonSubsequence {
    /**
     * Description for LongestCommonSubsequence:
     * 最长公共子序列
     */
    public int longestCommonSubsequence(String text1, String text2) {
        // code
        if (text1.length() < text2.length()) {
            String tmp = text1;
            text1 = text2;
            text2 = tmp;
        }

        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }

        return dp[m][n];
    }
}
