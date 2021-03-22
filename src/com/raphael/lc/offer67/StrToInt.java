package com.raphael.lc.offer67;

/**
 * @author Raphael
 * @date 2021-03-22 15:00:20
 */
class StrToInt {
    /**
     * Description for StrToInt:
     * 把字符串转换成整数
     */

    private int convert(long num) {
        if (num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) num;
    }

    public int strToInt(String str) {
        // code
        char[] chars = str.trim().toCharArray();
        int sign = 1;
        long ans = 0;

        for (int i = 0; i < chars.length; i++) {
            if (i == 0 && chars[0] == '-') {
                sign = -1;
                continue;
            }
            if (i == 0 && chars[0] == '+') {
                continue;
            }
            if (Character.isDigit(chars[i])) {
                ans = ans * 10 + chars[i] - '0';
            } else {
                return convert(ans * sign);
            }
            if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
                return convert(ans * sign);
            }
        }

        return convert(ans * sign);
    }
}
