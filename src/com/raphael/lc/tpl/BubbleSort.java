package com.raphael.lc.tpl;

/**
 * @author raphael
 * @date 2021-01-31 22:47:51
 */
class BubbleSort {
    /**
     * Description for BubbleSort:
     * 冒泡排序
     */
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public void sort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
    }
}
