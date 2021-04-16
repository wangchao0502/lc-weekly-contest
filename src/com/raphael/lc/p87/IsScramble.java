package com.raphael.lc.p87;

/**
 * @author Raphael
 * @date 2021-04-16 13:04:03
 */
class IsScramble {
    /**
     * Description for IsScramble:
     * 扰乱字符串
     */
    public boolean isScramble(String s1, String s2) {
        // code
        int n = s1.length();
        if (n == 1) return s1.equals(s2);

        boolean[][][] dp = new boolean[n][n][n + 1];

        for (int w = 1; w <= n; w++) {
            for (int i = 0; i <= n - w; i++) {
                for (int j = 0; j <= n - w; j++) {
                    if (w == 1) {
                        dp[i][j][w] = s1.charAt(i) == s2.charAt(j);
                        continue;
                    }
                    for (int k = 1; k < w; k++) {
                        dp[i][j][w] |= (dp[i][j + w - k][k] && dp[i + k][j][w - k]);
                        dp[i][j][w] |= (dp[i][j][k] && dp[i + k][j + k][w - k]);
                        // 如果满足条件就不要继续算了，后面子区间都不用动
                        if (dp[i][j][w]) {
                            break;
                        }
                    }
                }
            }
        }

        return dp[0][0][n];
    }
}
