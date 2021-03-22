package com.raphael.lc.offer64;

/**
 * @author Raphael
 * @date 2021-03-22 14:39:53
 */
class SumNums {
    /**
     * Description for SumNums:
     * 求1+2+..+n
     */
    public int sumNums(int n) {
        // code
        if (n == 0) return 0;
        return sumNums(n - 1) + n;
    }
}
