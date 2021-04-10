package com.raphael.lc.p263;

/**
 * @author Raphael
 * @date 2021-04-10 10:00:38
 */
class IsUgly {
    /**
     * Description for IsUgly:
     * 丑数
     */
    public boolean isUgly(int n) {
        // code
        if (n == 0) return false;
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        return n == 1;
    }
}
