package com.raphael.lc.p167;

/**
 * @author raphael
 * @date 2021-01-16 17:52:49
 */
class TwoSum {
    /**
     * Description for TwoSum:
     * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
     * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
     * 说明:
     * 返回的下标值（index1 和 index2）不是从零开始的。
     * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
     */
    public int[] twoSum(int[] numbers, int target) {
        // 本题可以用双指针，left++，right--，复杂度O(n)
        int len = numbers.length;

        for (int i = 0; i < len - 1; i++) {
            int tg = target - numbers[i];
            int left = i + 1;
            int right = len - 1;
            while (left <= right) {
                int mid = left + ((right - left) >> 1);
                if (numbers[mid] > tg) {
                    right = mid - 1;
                } else if (numbers[mid] < tg) {
                    left = mid + 1;
                } else {
                    return new int[]{i + 1, mid + 1};
                }
            }
        }

        return new int[]{1, 1};
    }
}
