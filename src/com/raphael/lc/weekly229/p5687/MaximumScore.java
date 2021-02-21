package com.raphael.lc.weekly229.p5687;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-02-21 10:56:55
 */
@SuppressWarnings("OptionalGetWithoutIsPresent")
class MaximumScore {
    /**
     * Description for MaximumScore:
     * 执行乘法运算的最大分数
     */
    public int maximumScore(int[] nums, int[] multipliers) {
        // code
        int n = nums.length;
        int m = multipliers.length;
        int[] dp = new int[m + 1];
        for (int i = 1; i < m + 1; i++) {
            dp[i] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < m; i++) {
            int[] ndp = new int[m + 1];
            for (int j = 0; j < m + 1; j++) {
                ndp[j] = Integer.MIN_VALUE;
            }
            for (int j = 0; j <= i; j++) {
                ndp[j + 1] = Math.max(ndp[j + 1], dp[j] + nums[j] * multipliers[i]);
                ndp[j] = Math.max(ndp[j], dp[j] + nums[n - 1 - (i - j)] * multipliers[i]);
            }
            dp = ndp;
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
