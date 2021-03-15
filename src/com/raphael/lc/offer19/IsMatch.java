package com.raphael.lc.offer19;

/**
 * @author Raphael
 * @date 2021-03-15 11:28:18
 */
@SuppressWarnings("AlibabaAvoidComplexCondition")
class IsMatch {
    /**
     * Description for IsMatch:
     * 正则表达式匹配
     */
    public boolean isMatch(String s, String p) {
        // code
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (j == 0) {
                    dp[i][0] = i == 0;
                } else {
                    if (p.charAt(j - 1) != '*') {
                        if (i > 0 && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.')) {
                            dp[i][j] = dp[i - 1][j - 1];
                        }
                    } else {
                        if (j > 1) {
                            dp[i][j] |= dp[i][j - 2];
                        }
                        if (i > 0 && j > 1 && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')) {
                            dp[i][j] |= dp[i - 1][j];
                        }
                    }
                }
            }
        }

        return dp[n][m];
    }
}
