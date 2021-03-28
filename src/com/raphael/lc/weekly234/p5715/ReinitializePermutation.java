package com.raphael.lc.weekly234.p5715;

/**
 * @author Raphael
 * @date 2021-03-28 10:38:07
 */
class ReinitializePermutation {
    /**
     * Description for ReinitializePermutation:
     * 还原排列的最少操作步数
     */
    public int reinitializePermutation(int n) {
        // code
        int ans = 0;
        int half = n / 2;
        int[] perm = new int[n];
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            perm[i] = i;
        }

        while (true) {
            ans++;
            for (int i = 0; i < n; i++) {
                if ((i & 1) == 1) {
                    arr[i] = perm[half + ((i - 1) >> 1)];
                } else {
                    arr[i] = perm[i >> 1];
                }
            }

            // check
            boolean isOk = true;
            for (int i = 0; i < n; i++) {
                if (arr[i] != i) {
                    isOk = false;
                    break;
                }
            }

            if (isOk) {
                break;
            }

            // copy
            System.arraycopy(arr, 0, perm, 0, n);
        }

        return ans;
    }
}
