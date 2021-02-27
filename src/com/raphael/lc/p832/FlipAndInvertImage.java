package com.raphael.lc.p832;

/**
 * @author Raphael
 * @date 2021-02-24 13:47:15
 */
class FlipAndInvertImage {
    /**
     * Description for FlipAndInvertImage:
     * 翻转图像
     */
    public int[][] flipAndInvertImage(int[][] a) {
        // code
        int m = a.length;
        int n = a[0].length;
        for (int i = 0; i < m; i++) {
            int l = 0, r = n - 1;
            while (l <= r) {
                if (a[i][l] == a[i][r]) {
                    a[i][l] ^= 1;
                    if (l != r) {
                        a[i][r] ^= 1;
                    }
                }
                l++;
                r--;
            }
        }
        return a;
    }
}
