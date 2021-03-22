package com.raphael.lc.p191;

/**
 * @author Raphael
 * @date 2021-03-22 10:57:32
 */
class HammingWeight {
    /**
     * Description for HammingWeight:
     * 位1的个数
     */
    public int hammingWeight(int n) {
        // code
        int ans = 0;

        while (n != 0) {
            if ((n & 1) == 1) ans++;
            n >>>= 1;
        }

        return ans;
    }
}
