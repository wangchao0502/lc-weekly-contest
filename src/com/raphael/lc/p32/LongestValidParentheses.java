package com.raphael.lc.p32;

/**
 * @author raphael
 * @date 2021-01-19 21:40:59
 */
class LongestValidParentheses {
    /**
     * Description for LongestValidParentheses:
     * 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
     */
    public int longestValidParentheses(String s) {
        // code
        int n = s.length();
        if (n <= 1 ) {
            return 0;
        }

        char[] chars = s.toCharArray();
        // dp[i] 第i个字符串的最长有效括号字串长度
        int[] dp = new int[n];
        int ans = 0;

        for (int i = 1; i < n; i++) {
            if (chars[i] == ')') {
                if (chars[i - 1] == '(') {
                    dp[i] = i >= 2 ? dp[i - 2] + 2 : 2;
                } else if (i - dp[i - 1] > 0 && chars[i - dp[i - 1] - 1] == '(') {
                    dp[i] = 2 + dp[i - 1] + (i - dp[i - 1] >= 2 ? dp[i - dp[i - 1] - 2] : 0);
                }
                ans = Math.max(ans, dp[i]);
            }
        }

        return ans;
    }
}
