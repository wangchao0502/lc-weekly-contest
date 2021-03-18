package com.raphael.lc.offer42;

/**
 * @author Raphael
 * @date 2021-03-18 11:16:10
 */
class MaxSubArray {
    /**
     * Description for MaxSubArray:
     * 连续子数组的最大和
     */
    public int maxSubArray(int[] nums) {
        // code
        int cur = 0;
        int ans = Integer.MIN_VALUE;

        for (int num : nums) {
            cur += num;
            ans = Math.max(ans, cur);
            cur = Math.max(cur, 0);
        }

        return ans;
    }
}
