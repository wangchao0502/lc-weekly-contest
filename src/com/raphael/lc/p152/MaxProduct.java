package com.raphael.lc.p152;

/**
 * @author Raphael
 * @date 2021-02-27 17:04:25
 */
class MaxProduct {
    /**
     * Description for MaxProduct:
     * 乘积最大子数组
     */
    public int maxProduct(int[] nums) {
        // code
        int n = nums.length;
        int maxF = nums[0], minF = nums[0], ans = nums[0];
        for (int i = 1; i < n; i++) {
            int mx = maxF, mn = minF;
            maxF = Math.max(mx * nums[i], Math.max(mn * nums[i], nums[i]));
            minF = Math.min(mx * nums[i], Math.min(mn * nums[i], nums[i]));
            ans = Math.max(ans, maxF);
        }

        return ans;
    }
}
