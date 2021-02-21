package com.raphael.lc.p1438;


import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Raphael
 * @date 2021-02-21 12:51:23
 */
class LongestSubarray {
    /**
     * Description for LongestSubarray:
     * 绝对差不超过限制的最长连续子数组
     */
    @SuppressWarnings("ConstantConditions")
    public int longestSubarray(int[] nums, int limit) {
        // code
        int n = nums.length;
        int left = 0, right = 0;
        int ans = 0;
        // 单调递增，递减队列
        Deque<Integer> queMax = new LinkedList<>();
        Deque<Integer> queMin = new LinkedList<>();

        while (right < n) {
            while (!queMax.isEmpty() && queMax.peekLast() < nums[right]) {
                queMax.pollLast();
            }
            while (!queMin.isEmpty() && queMin.peekLast() > nums[right]) {
                queMin.pollLast();
            }
            queMax.offerLast(nums[right]);
            queMin.offerLast(nums[right]);
            while (!queMax.isEmpty() && !queMin.isEmpty() && queMax.peekFirst() - queMin.peekFirst() > limit) {
                if (nums[left] == queMin.peekFirst()) {
                    queMin.pollFirst();
                }
                if (nums[left] == queMax.peekFirst()) {
                    queMax.pollFirst();
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }

        return ans;
    }
}
