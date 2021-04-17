package com.raphael.lc.biweekly50.p5717;

/**
 * @author Raphael
 * @date 2021-04-17 23:06:30
 */
class MinOperations {
    /**
     * Description for MinOperations:
     * 最少操作使数组递增
     */
    public int minOperations(int[] nums) {
        // code
        int ans = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                ans += nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
            }
        }

        return ans;
    }
}
