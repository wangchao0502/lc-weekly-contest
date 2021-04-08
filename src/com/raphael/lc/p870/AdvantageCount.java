package com.raphael.lc.p870;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Raphael
 * @date 2021-04-08 11:31:39
 */
class AdvantageCount {
    /**
     * Description for AdvantageCount:
     * 优势洗牌
     */
    public int[] advantageCount(int[] a, int[] b) {
        // code
        int n = a.length;
        Arrays.sort(a);
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i] = new int[]{b[i], i};
        }
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[0]));

        int[] ans = new int[n];
        for (int i = 0, l = 0, r = n - 1; i < n; i++) {
            if (a[i] > pairs[l][0]) {
                ans[pairs[l++][1]] = a[i];
            } else {
                ans[pairs[r--][1]] = a[i];
            }
        }

        return ans;
    }
}
