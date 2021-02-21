package com.raphael.lc.weekly229.p5688;

/**
 * @author Raphael
 * @date 2021-02-21 12:28:24
 */
class LongestPalindrome {
    /**
     * Description for LongestPalindrome:
     * 最长回文子序列
     */
    public int longestPalindrome(String word1, String word2) {
        // code
        return longestPalindromeSub(word1 + word2, word1.length());
    }

    private int longestPalindromeSub(String s, int x) {
        char[] chs = s.toCharArray();
        int len = chs.length;
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }

        int max = 0;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                if (chs[i] == chs[j]) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                    if (i < x && j >= x) {
                        max = Math.max(max, dp[i][j]);
                    }
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return max;
    }
}
