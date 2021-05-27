package com.raphael.lc.p461;

/**
 * @author Raphael
 * @date 2021-05-27 12:26:12
 */
class HammingDistance {
    /**
     * Description for HammingDistance:
     * 汉明距离
     */
    public int hammingDistance(int x, int y) {
        // code
        int ans = 0;

        while (x != 0 || y != 0) {
            ans += (x & 1) ^ (y & 1);
            x >>= 1;
            y >>= 1;
        }

        return ans;
    }
}
