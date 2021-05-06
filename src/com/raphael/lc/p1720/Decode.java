package com.raphael.lc.p1720;

/**
 * @author Raphael
 * @date 2021-05-06 13:36:18
 */
class Decode {
    /**
     * Description for Decode:
     * 解码异或后的数组
     */
    public int[] decode(int[] encoded, int first) {
        // code
        int n = encoded.length;
        int[] ans = new int[n + 1];
        ans[0] = first;

        for (int i = 0; i < n; i++) {
            ans[i + 1] = encoded[i] ^ ans[i];
        }

        return ans;
    }
}
