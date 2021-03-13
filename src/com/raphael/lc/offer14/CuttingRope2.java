package com.raphael.lc.offer14;

/**
 * @author Raphael
 * @date 2021-03-13 14:25:19
 */
class CuttingRope2 {
    /**
     * Description for CuttingRope2:
     * 剪绳子2
     */
    public int cuttingRope2(int n) {
        // code
        if (n < 4) {
            return n - 1;
        }
        long res = 1;
        while (n > 4) {
            res = res * 3 % 1000000007;
            n -= 3;
        }
        return (int) (res * n % 1000000007);
    }
}
