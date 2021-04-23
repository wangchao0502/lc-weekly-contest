package com.raphael.lc.p201;

/**
 * @author Raphael
 * @date 2021-04-23 10:48:58
 */
class RangeBitwisedAnd {
    /**
     * Description for RangeBitwisedAnd:
     * 数字范围按位与
     */
    public int rangeBitwisedAnd(int left, int right) {
        // code
        while (left < right) {
            right &= right - 1;
        }
        return right;
    }
}
