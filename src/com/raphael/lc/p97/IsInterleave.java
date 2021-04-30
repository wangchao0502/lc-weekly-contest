package com.raphael.lc.p97;

/**
 * @author Raphael
 * @date 2021-04-30 16:48:44
 */
class IsInterleave {
    /**
     * Description for IsInterleave:
     * 交错字符串
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        // code
        int n = s1.length();
        int m = s2.length();
        int t = s3.length();

        if (n + m != t) {
            return false;
        }

        boolean[][] dp = new boolean[n + 1][m + 1];

        dp[0][0] = true;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                int p = i + j - 1;
                if (i > 0) {
                    dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(p);
                }
                if (j > 0 && !dp[i][j]) {
                    dp[i][j] = dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(p);
                }
            }
        }

        return dp[n][m];
    }
}
