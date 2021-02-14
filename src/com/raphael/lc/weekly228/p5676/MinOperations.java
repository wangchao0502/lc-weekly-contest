package com.raphael.lc.weekly228.p5676;

/**
 * @author raphael
 * @date 2021-02-14 10:40:59
 */
class MinOperations {
    /**
     * Description for MinOperations:
     * 生成交替二进制字符串的最少操作数
     */
    public int minOperations(String s) {
        // code 两次异或
        // 101010
        // 010101
        // 100101
        char[] chars = s.toCharArray();
        int n = chars.length;
        int ans01 = 0;
        int ans10 = 0;

        for (int i = 0; i < n; i++) {
            // 奇数
            if (i % 2 == 1) {
                ans10 += chars[i] == '0' ? 0 : 1;
                ans01 += chars[i] == '1' ? 0 : 1;
            } else {
                ans10 += chars[i] == '1' ? 0 : 1;
                ans01 += chars[i] == '0' ? 0 : 1;
            }
        }

        return Math.min(ans01, ans10);
    }
}
