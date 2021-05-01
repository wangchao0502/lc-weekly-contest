package com.raphael.lc.biweekly51.p5732;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-05-01 23:14:35
 */
class MaximumElementAfterDecrementingAndRearranging {
    /**
     * Description for MaximumElementAfterDecrementingAndRearranging:
     * 减小和重新排列数组后的最大元素
     */
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        // code
        Arrays.sort(arr);
        int n = arr.length;

        arr[0] = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] <= 1) {
                continue;
            }
            arr[i] = arr[i - 1] + 1;
        }

        return arr[n - 1];
    }
}
