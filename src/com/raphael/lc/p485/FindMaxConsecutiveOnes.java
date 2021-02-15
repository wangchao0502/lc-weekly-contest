package com.raphael.lc.p485;

/**
 * @author raphael
 * @date 2021-02-15 14:26:12
 */
class FindMaxConsecutiveOnes {
    /**
     * Description for FindMaxConsecutiveOnes:
     * 最大连续1的个数
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        // code
        int left = 0, right = 0;
        int n = nums.length;
        int ans = 0;

        while (right < n) {
            if (nums[right] == 1) {
                right++;
            } else {
                ans = Math.max(ans, right - left);
                right++;
                left = right;
            }
        }

        ans = Math.max(ans, right - left);

        return ans;
    }
}
