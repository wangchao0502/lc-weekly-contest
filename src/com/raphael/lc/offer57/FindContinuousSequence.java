package com.raphael.lc.offer57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-03-22 12:18:49
 */
class FindContinuousSequence {
    /**
     * Description for FindContinuousSequence:
     * 和为s的连续正数序列
     */
    public int[][] findContinuousSequence(int target) {
        // code
        int n = target / 2 + 1;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        int left = 0, right = 0;
        int sum = 0;
        List<int[]> list = new ArrayList<>();

        while (right < n) {
            sum += nums[right];
            right++;
            while (sum > target) {
                sum -= nums[left++];
            }
            if (sum == target) {
                list.add(Arrays.copyOfRange(nums, left, right));
            }
        }

        int[][] ans = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
