package com.raphael.lc.p377;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-03-05 15:47:05
 */
class CombinationSum4 {
    /**
     * Description for CombinationSum4:
     * 组合总数4
     */
    public int combinationSum4(int[] nums, int target) {
        // code
        int n = nums.length;
        int[] dp = new int[target + 1];

        for (int num : nums) {
            if (num <= target) {
                dp[num] = 1;
            }
        }

        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i >= num && dp[i - num] > 0) {
                    dp[i] += dp[i - num];
                }
            }
        }

        return dp[target];
    }
}
