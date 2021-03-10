package com.raphael.lc.offer10;

/**
 * @author Raphael
 * @date 2021-03-10 13:37:15
 */
class Fib {
    /**
     * Description for Fib:
     */
    public int fib(int n) {
        // code
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
