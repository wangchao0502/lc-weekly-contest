package com.raphael.lc.offer57;

/**
 * @author Raphael
 * @date 2021-03-22 12:09:06
 */
class TwoSum {
    /**
     * Description for TwoSum:
     * 和为s的两个数字
     */
    public int[] twoSum(int[] nums, int target) {
        // code
        int n = nums.length;
        int left = 0, right = n - 1;

        while (left < right) {
            int a = nums[left];
            int b = nums[right];
            int sum = a + b;
            if (sum == target) {
                return new int[]{a, b};
            }
            if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return null;
    }
}
