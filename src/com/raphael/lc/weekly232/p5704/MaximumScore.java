package com.raphael.lc.weekly232.p5704;

/**
 * @author Raphael
 * @date 2021-03-14 11:32:25
 */
class MaximumScore {
    /**
     * Description for MaximumScore:
     * 好子数组的最大分数
     */
    public int maximumScore(int[] nums, int k) {
        // code
        int n = nums.length;
        int[] leftRangeMin = new int[k + 1];
        int[] rightRangeMin = new int[n - k];
        int ans = 0;

        for (int i = k; i >= 0; i--) {
            if (i == k) {
                leftRangeMin[i] = nums[i];
            } else {
                leftRangeMin[i] = Math.min(leftRangeMin[i + 1], nums[i]);
            }
        }
        for (int i = k; i < n; i++) {
            if (i == k) {
                rightRangeMin[i - k] = nums[i];
            } else {
                rightRangeMin[i - k] = Math.min(rightRangeMin[i - k - 1], nums[i]);
            }
        }

        for (int i = 0; i <= k; i++) {
            for (int j = k; j < n; j++) {
                ans = Math.max(ans, Math.min(leftRangeMin[i], rightRangeMin[j - k]) * (j - i + 1));
            }
        }

        return ans;
    }
}
