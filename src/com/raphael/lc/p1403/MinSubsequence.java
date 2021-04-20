package com.raphael.lc.p1403;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-04-20 16:14:45
 */
class MinSubsequence {
    /**
     * Description for MinSubsequence:
     * 非递增顺序的最小子序列
     */
    public List<Integer> minSubsequence(int[] nums) {
        // code
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, right = n - 1;

        List<Integer> ans = new ArrayList<>();
        int leftSum = 0, rightSum = 0;

        while (left <= right) {
            if (leftSum + nums[left] >= rightSum) {
                rightSum += nums[right];
                ans.add(nums[right--]);
            } else {
                leftSum += nums[left++];
            }
        }

        return ans;
    }
}
