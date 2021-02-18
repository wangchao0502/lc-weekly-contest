package com.raphael.lc.tpl;

/**
 * @author raphael
 * @date 2021-02-01 00:41:13
 */
class BinarySearchUpperBound {
    /**
     * Description for BinarySearchUpperBound:
     * 找到目标值的左边界
     * 1. 数组有序，但包含重复元素
     * 2. 数组部分有序，且不包含重复元素 -> 旋转数组
     * 3. 数组部分有序，且包含重复元素 -> 旋转重复元素数组
     * 参考C++ upper_bound函数
     * Returns an iterator pointing to the first element in the range [left, right)
     * that is greater than value, or last if no such element is found.
     */
    public int binarySearchUpperBound(int[] nums, int target) {
        // code
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] <= target) left = mid + 1;
            else right = mid;
        }
        // 如果所有数字都小于等于target，返回nums.length，这个下标是越界的！
        // 返回数组中第一个大于target的下标位置
        // 如果在没有target的时候返回-1，添加如下两行代码
        // if (left == nums.length) return -1;
        // return nums[left - 1] == target ? left - 1 : -1;
        return left;
    }
}
