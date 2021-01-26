package com.raphael.lc.p44;

/**
 * @author raphael
 * @date 2021-01-26 21:14:54
 */
class IsMatch {
    /**
     * Description for IsMatch:
     * 通配符匹配
     */
    public boolean isMatch(String s, String p) {
        // code
        int m = s.length();
        int n = p.length();
        // dp[i][j] 表示字符串s的i位匹配到p的j位是否一致
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int i = 1; i <= n; i++) {
            if (p.charAt(i - 1) == '*') {
                dp[0][i] = true;
            } else {
                break;
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }

        return dp[m][n];
    }
}
