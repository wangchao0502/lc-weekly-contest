package com.raphael.lc.offer15;

/**
 * @author Raphael
 * @date 2021-03-15 10:55:43
 */
class HammingWeight {
    /**
     * Description for HammingWeight:
     * 二进制中1的个数
     */
    public int hammingWeight(int n) {
        // code
        int ans = 0;
        while (n != 0) {
            ans += n & 1;
            n >>>= 1;
        }
        return ans;
    }
}
