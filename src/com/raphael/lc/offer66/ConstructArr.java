package com.raphael.lc.offer66;

/**
 * @author Raphael
 * @date 2021-03-22 14:43:16
 */
class ConstructArr {
    /**
     * Description for ConstructArr:
     * 构建乘积数组
     */
    public int[] constructArr(int[] a) {
        // code
        if (a.length == 0) return new int[0];
        int[] b = new int[a.length];
        int tmp = 1;

        b[0] = 1;

        for (int i = 1; i < a.length; i++) {
            b[i] = b[i - 1] * a[i - 1];
        }
        for (int i = a.length - 2; i >= 0; i--) {
            tmp *= a[i + 1];
            b[i] *= tmp;
        }

        return b;
    }
}
