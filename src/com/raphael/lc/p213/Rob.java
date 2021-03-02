package com.raphael.lc.p213;

/**
 * @author Raphael
 * @date 2021-02-27 19:28:20
 */
class Rob {
    /**
     * Description for Rob:
     * 打家劫舍2
     */
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }
        return Math.max(dp(nums, 0), dp(nums, 1));
    }

    private int dp(int[] nums, int start) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[1] = nums[start];

        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i - 1 + start], dp[i - 1]);
        }

        return dp[len - 1];
    }
}
