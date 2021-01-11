package com.raphael.lc.p88;

/**
 * @author raphael
 * @date 2021-01-11 23:46:34
 */
class Merge {
    /**
     * Description for Merge:
     * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 有足够的空间（空间大小等于 m + n）来保存 nums2 中的元素。
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // code
        int p1 = m - 1;
        int p2 = n - 1;
        int right = m + n - 1;

        // right指向最右空位, p1, p2分别指向nums1, nums2的最大值
        while (p1 >= 0 && p2 >= 0) {
            nums1[right--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        }

        // copy missing p2 nums
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
