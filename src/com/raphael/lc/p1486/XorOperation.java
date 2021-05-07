package com.raphael.lc.p1486;

/**
 * @author Raphael
 * @date 2021-05-07 10:47:12
 */
class XorOperation {
    /**
     * Description for XorOperation:
     * 数组异或操作
     */
    public int xorOperation(int n, int start) {
        // code
        int ans = start;

        for (int i = 1; i < n; i++) {
            ans ^= start + 2 * i;
        }

        return ans;
    }
}
