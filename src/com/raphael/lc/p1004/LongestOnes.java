package com.raphael.lc.p1004;

/**
 * @author Raphael
 * @date 2021-02-19 16:21:47
 */
class LongestOnes {
    /**
     * Description for LongestOnes:
     * 最大连续1的个数3
     */
    public int longestOnes(int[] nums, int k) {
        // code
        int left = 0, right = 0, ans = 0;
        int zeroCount = 0;

        while (right < nums.length) {
            if (nums[right++] == 0 && ++zeroCount > k) {
                // 跳过第一个0
                while (nums[left++] != 0) ;
                zeroCount--;
            }
            ans = Math.max(ans, right - left);
        }

        return ans;
    }
}
