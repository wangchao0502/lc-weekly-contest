package com.raphael.lc.offer16;

/**
 * @author Raphael
 * @date 2021-03-15 11:01:31
 */
class MyPow {
    /**
     * Description for MyPow:
     * 数值的整数次方
     */
    public double myPow(double x, int n) {
        // code
        int sign = n >= 0 ? 1 : -1;
        long e = Math.abs((long) n);
        double ans = 1;
        double tmp = x;

        while (e > 0) {
            if ((e & 1) == 1) {
                ans *= tmp;
            }
            tmp *= tmp;
            e >>= 1;
        }

        return sign == 1 ? ans : 1 / ans;
    }
}
