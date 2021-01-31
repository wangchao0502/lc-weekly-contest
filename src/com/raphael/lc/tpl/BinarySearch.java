package com.raphael.lc.tpl;

/**
 * @author raphael
 * @date 2021-02-01 00:02:14
 */
@SuppressWarnings("AliControlFlowStatementWithoutBraces")
class BinarySearch {
    /**
     * Description for BinarySearch:
     * 二分查找
     */
    public int binarySearch(int[] nums, int target) {
        // code
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] > target) right = mid - 1;
            else if (nums[mid] < target) left = mid + 1;
            else return mid;
        }
        return -1;
    }
}
