package com.raphael.lc.p209;

/**
 * @author raphael
 * @date 2021-02-05 10:42:22
 */
class MinSubArrayLen {
    /**
     * Description for MinSubArrayLen:
     * 长度最小的子数组
     */
    public int minSubArrayLen(int target, int[] nums) {
        // code
        int minLength = Integer.MAX_VALUE;
        int left = 0, right = 0;
        int n = nums.length;
        int sum = 0;

        while (right < n) {
            sum += nums[right++];
            while (sum >= target) {
                minLength = Math.min(minLength, right - left);
                sum -= nums[left++];
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
