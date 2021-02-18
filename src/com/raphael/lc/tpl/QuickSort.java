package com.raphael.lc.tpl;

/**
 * @author raphael
 * @date 2021-01-31 20:11:27
 */
class QuickSort {
    /**
     * Description for QuickSort:
     * 快排，分治
     */
    public void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;

        int i = left - 1, j = right + 1;
        int pivot = nums[left + ((right - left) >> 1)];

        while (i < j) {
            do i++; while (nums[i] < pivot);
            do j--; while (nums[j] > pivot);
            if (i < j) swap(nums, i, j);
        }
        quickSort(nums, left, j);
        quickSort(nums, j + 1, right);
    }

    public void sort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }
}
