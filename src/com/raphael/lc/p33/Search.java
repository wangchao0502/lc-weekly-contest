package com.raphael.lc.p33;

/**
 * @author raphael
 * @date 2021-01-11 17:44:22
 */
class Search {
    /**
     * Description for Search:
     * 升序排列的整数数组 nums
     * 在预先未知的某个点上进行了旋转（例如，[0,1,2,4,5,6,7]经旋转后可能变为[4,5,6,7,0,1,2]）。
     * 请你在数组中搜索 target ，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
     */
    public int search(int[] nums, int target) {
        // code, log(n), binary seach
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= nums[mid]) {
                if (target < nums[mid] && nums[0] <= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && nums[n - 1] >= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
