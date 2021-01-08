package com.raphael.lc.p29;

/**
 * @author raphael
 * @date 2021-01-08 17:33:47
 */
class Divide {
    /**
     * 给定两个整数，被除数dividend和除数divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
     * 返回被除数dividend除以除数divisor得到的商。
     * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
     */
    public int divide(int dividend, int divisor) {
        // code
        // 二分法 dividend而每次减去2^n个divisor, 同时result每次加2^n
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean k = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0);
        int ans = 0;
        dividend = -Math.abs(dividend);
        divisor = -Math.abs(divisor);

        while (dividend <= divisor) {
            int tmp = divisor;
            int c = 1;
            while (dividend - tmp <= tmp) {
                tmp <<= 1;
                c <<= 1;
            }
            dividend -= tmp;
            ans += c;
        }
        return k ? ans : -ans;
    }
}
