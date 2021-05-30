package com.raphael.lc.p231;

/**
 * @author Raphael
 * @date 2021-05-30 09:56:29
 */
class IsPowerOfTwo {
    /**
     * Description for IsPowerOfTwo:
     * 2的幂
     */
    public boolean isPowerOfTwo(int n) {
        // code
        return n > 0 && (n & (n - 1)) == 0;
    }
}
