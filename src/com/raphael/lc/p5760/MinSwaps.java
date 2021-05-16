package com.raphael.lc.p5760;

/**
 * @author Raphael
 * @date 2021-05-16 10:44:09
 */
class MinSwaps {
    /**
     * Description for MinSwaps:
     * 构成交替字符串需要的最小交换次数
     */
    public int minSwaps(String s) {
        // code
        int oneCount = 0;
        int zeroCount = 0;
        int n = s.length();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (c == '0') {
                zeroCount++;
            } else {
                oneCount++;
            }
        }
        if (Math.abs(zeroCount - oneCount) > 1) {
            return -1;
        }

        char target;

        if (zeroCount == oneCount) {
            int count1 = 0;
            int count0 = 0;
            for (int i = 0; i < n; i += 2) {
                if (chars[i] != '0') count0++;
                if (chars[i] != '1') count1++;
            }
            return Math.min(count0, count1);
        }

        // 多的开头
        int count = 0;
        target = zeroCount > oneCount ? '0' : '1';
        for (int i = 0; i < n; i += 2) {
            if (chars[i] != target) {
                count++;
            }
        }
        return count;
    }
}
