package com.raphael.lc.tpl;

/**
 * @author raphael
 * @date 2021-02-01 00:41:13
 */
@SuppressWarnings("AliControlFlowStatementWithoutBraces")
class BinarySearchRightBoundary {
    /**
     * Description for BinarySearchRightBoundary:
     * 和左边界二分查找类似
     */
    public int binarySearchRightBoundary(int[] nums, int target) {
        // code
        int left = 0, right = nums.length;
        while (left < right) {
            // 向上取整
            int mid = left + ((right - left) >> 1) + 1;
            if (nums[mid] > target) right = mid - 1;
            else left = mid;
        }
        return nums[right] == target ? right : -1;
    }
}
