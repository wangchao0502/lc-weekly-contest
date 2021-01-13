package com.raphael.lc.p50;

/**
 * @author raphael
 * @date 2021-01-13 10:52:37
 */
class MyPow {
    /**
     * Description for MyPow:
     * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
     */
    public double myPow(double x, int n) {
        // code, n = 2^x + k
        double ans = 1;
        double last = x;
        int sign = n > 0 ? 1 : -1;
        long bit = Math.abs((long) n);

        while (bit > 0) {
            if ((1 & bit) == 1) {
                ans *= last;
            }
            last *= last;
            bit >>>= 1;
        }

        return sign > 0 ? ans : 1 / ans;
    }
}
