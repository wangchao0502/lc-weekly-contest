package com.raphael.lc.p1005;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-04-12 12:12:15
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
class LargestSumAfterKNegations {
    /**
     * Description for LargestSumAfterKNegations:
     * K次取反后最大化的数组和
     */
    public int largestSumAfterKNegations(int[] a, int k) {
        // code
        Arrays.sort(a);
        int nc = 0;

        for (int n : a) {
            if (n >= 0) {
                break;
            }
            nc++;
        }

        if (nc == 0) {
            k %= 2;
        } else if (nc < k) {
            if ((k - nc) % 2 == 1) {
                k = a[nc] > -a[nc - 1] ? nc - 1 : nc + 1;
            } else {
                k = nc;
            }
        }

        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            if (i < k) {
                ans += -a[i];
            } else {
                ans += a[i];
            }
        }

        return ans;
    }
}
