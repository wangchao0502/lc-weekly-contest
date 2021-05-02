package com.raphael.lc.weekly239.p5746;

/**
 * @author Raphael
 * @date 2021-05-02 10:31:16
 */
class GetMinDistance {
    /**
     * Description for GetMinDistance:
     * 到目标元素的最小距离
     */
    public int getMinDistance(int[] nums, int target, int start) {
        // code
        int ans = Integer.MAX_VALUE;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                ans = Math.min(ans, Math.abs(i - start));
            }
        }

        return ans;
    }
}
