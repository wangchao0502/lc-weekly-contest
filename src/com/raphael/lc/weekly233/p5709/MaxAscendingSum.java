package com.raphael.lc.weekly233.p5709;

/**
 * @author Raphael
 * @date 2021-03-21 10:30:26
 */
class MaxAscendingSum {
    /**
     * Description for MaxAscendingSum:
     * 最大升序子数组和
     */
    public int maxAscendingSum(int[] nums) {
        // code
        int sum = nums[0];
        int ans = sum;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
                ans = Math.max(ans, sum);
            } else {
                sum = nums[i];
            }
        }

        return ans;
    }
}
