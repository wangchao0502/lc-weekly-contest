package com.raphael.lc.p132;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-03-08 12:01:29
 */
class MinCut {
    /**
     * Description for MinCut:
     * 分割回文串2
     */
    public int minCut(String s) {
        // code
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        char[] chars = s.toCharArray();
        
        // dp[i][j] = true; i >= j
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = true;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = dp[i + 1][j - 1] && (chars[i] == chars[j]);
            }
        }

        // 统计最少分割次数
        int[] f = new int[n];
        Arrays.fill(f, Integer.MAX_VALUE);

        for (int i = 0; i < n; i++) {
            if (dp[0][i]) {
                f[i] = 0;
            } else {
                for (int j = 0; j < i; j++) {
                    if (dp[j + 1][i]) {
                        f[i] = Math.min(f[i], f[j] + 1);
                    }
                }
            }
        }

        return f[n - 1];
    }
}
