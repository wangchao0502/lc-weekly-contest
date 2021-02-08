package com.raphael.lc.p978;

/**
 * @author raphael
 * @date 2021-02-08 13:52:12
 */
class MaxTurbulenceSize {
    /**
     * Description for MaxTurbulenceSize:
     * 最长湍流子数组
     */
    public int maxTurbulenceSize(int[] arr) {
        // code
        int n = arr.length;
        int left = 0, right = 1;
        int maxLength = 1;
        // up -> 1, down -> 2, equal -> 0
        int upOrDown = 0;

        while (right < n) {
            // 1,3,2,4,4,2,5
            if (arr[right] > arr[right - 1]) {
                if (upOrDown != 2) {
                    left = right - 1;
                }
                upOrDown = 1;
            } else if (arr[right] < arr[right - 1]) {
                if (upOrDown != 1) {
                    left = right - 1;
                }
                upOrDown = 2;
            } else {
                upOrDown = 0;
                left = right;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}
