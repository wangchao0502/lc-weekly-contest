package com.raphael.lc.offer53;

/**
 * @author Raphael
 * @date 2021-03-20 21:51:49
 */
class Search {
    /**
     * Description for Search:
     * 再排序数组中查找数字1
     */
    public int search(int[] nums, int target) {
        // code
        int n = nums.length;
        int left = 0, right = 0;

        while (left < n && nums[left] != target) {
            left++;
        }

        right = left;

        while (right < n && nums[right] == target) {
            right++;
        }

        return right - left;
    }
}
