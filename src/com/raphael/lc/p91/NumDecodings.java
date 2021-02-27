package com.raphael.lc.p91;

/**
 * @author Raphael
 * @date 2021-02-25 15:46:10
 */
class NumDecodings {
    /**
     * Description for NumDecodings:
     * 解码方法
     */
    public int numDecodings(String s) {
        // code
        int len = s.length();
        if (len == 0) {
            return 0;
        }

        int[] dp = new int[len + 1];
        dp[0] = 1;

        char[] charArray = s.toCharArray();
        if (charArray[0] == '0') {
            return 0;
        }
        dp[1] = 1;

        for (int i = 1; i < len; i++) {
            if (charArray[i] != '0') {
                dp[i + 1] = dp[i];
            }

            int num = 10 * (charArray[i - 1] - '0') + (charArray[i] - '0');
            if (num >= 10 && num <= 26) {
                dp[i + 1] += dp[i - 1];
            }
        }
        return dp[len];
    }
}
