package com.raphael.lc.p179;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-04-12 11:35:29
 */
class LargestNumber {
    /**
     * Description for LargestNumber:
     * 最大数
     */
    public String largestNumber(int[] nums) {
        // code
        int n = nums.length;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (x, y) -> {
            long sx = 10, sy = 10;
            while (sx <= x) {
                sx *= 10;
            }
            while (sy <= y) {
                sy *= 10;
            }
            return (int) (-sy * x - y + sx * y + x);
        });

        if (arr[0] == 0) return "0";

        StringBuilder sb = new StringBuilder();
        for (Integer num : arr) {
            sb.append(num);
        }

        return sb.toString();
    }
}
