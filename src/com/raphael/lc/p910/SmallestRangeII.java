package com.raphael.lc.p910;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-04-09 17:14:50
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
class SmallestRangeII {
    /**
     * Description for SmallestRangeII:
     * 最小差值2
     */
    public int smallestRangeII(int[] a, int k) {
        // code
        Arrays.sort(a);
        int n = a.length;
        int res = a[n - 1] - a[0];
        for (int i = 1; i < n; i++) {
            int min = Math.min(a[0] + k, a[i] - k);
            int max = Math.max(a[n - 1] - k, a[i - 1] + k);
            res = Math.min(max - min, res);
        }
        return res;
    }
}
