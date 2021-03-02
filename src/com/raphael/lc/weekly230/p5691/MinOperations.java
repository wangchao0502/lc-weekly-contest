package com.raphael.lc.weekly230.p5691;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-02-28 12:03:22
 */
class MinOperations {
    /**
     * Description for MinOperations:
     * 通过最少操作次数使数组的和相等
     */
    public int minOperations(int[] nums1, int[] nums2) {
        // code
        int n = nums1.length;
        int m = nums2.length;
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < n; i++) {
            sumA += nums1[i];
        }
        for (int i = 0; i < m; i++) {
            sumB += nums2[i];
        }

        if (n > m * 6 || m > n * 6) {
            return -1;
        }
        int count = 0;

        if (sumA < sumB) {
            int[] tmp = nums2;
            nums2 = nums1;
            nums1 = tmp;
            n = nums1.length;
            m = nums2.length;
        }
        int diff = Math.abs(sumA - sumB);
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int ptrA = n - 1;
        int ptrB = 0;
        while (diff > 0 && ptrB < m && ptrA >= 0) {
            if (6 - nums2[ptrB] < nums1[ptrA] - 1) {
                diff -= nums1[ptrA--] - 1;
            } else {
                diff -= 6 - nums2[ptrB++];
            }
            count++;
        }

        while (diff > 0 && ptrB < m) {
            diff -= nums2[ptrB++] - 1;
            count++;
        }
        while (diff > 0 && ptrA >= 0) {
            diff -= nums1[ptrA--] - 1;
            count++;
        }

        return diff <= 0 ? count : -1;
    }
}
