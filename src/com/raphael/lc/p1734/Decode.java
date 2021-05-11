package com.raphael.lc.p1734;

/**
 * @author Raphael
 * @date 2021-05-11 09:57:42
 */
class Decode {
    /**
     * Description for Decode:
     * 解码异或后的排列
     */
    public int[] decode(int[] encoded) {
        // code
        int n = encoded.length + 1;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total ^= i;
        }
        int odd = 0;
        for (int i = 1; i < n - 1; i += 2) {
            odd ^= encoded[i];
        }
        int[] perm = new int[n];
        perm[0] = total ^ odd;
        for (int i = 0; i < n - 1; i++) {
            perm[i + 1] = perm[i] ^ encoded[i];
        }
        return perm;
    }
}
