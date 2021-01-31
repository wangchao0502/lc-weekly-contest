package com.raphael.lc.tpl;

/**
 * @author raphael
 * @date 2021-02-01 00:13:24
 */
@SuppressWarnings("AliControlFlowStatementWithoutBraces")
class BinarySearchLeftBoundary {
    /**
     * Description for BinarySearchLeftBoundary:
     * 找到目标值的左边界
     * 1. 数组有序，但包含重复元素
     * 2. 数组部分有序，且不包含重复元素 -> 旋转数组
     * 3. 数组部分有序，且包含重复元素 -> 旋转重复元素数组
     */
    public int binarySearchLeftBoundary(int[] nums, int target) {
        // code
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] < target) left = mid + 1;
            else right = mid;
        }
        return nums[left] == target ? left : -1;
    }
}
