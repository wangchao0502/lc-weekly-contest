package com.raphael.lc.p35;

/**
 * @author raphael
 * @date 2021-01-13 10:46:09
 */
class SearchInsert {
    /**
     * Description for SearchInsert:
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * 你可以假设数组中无重复元素。
     */
    public int searchInsert(int[] nums, int target) {
        // code
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) >> 2);
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return left;
    }
}
