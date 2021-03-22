package com.raphael.lc.offer59;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Raphael
 * @date 2021-03-22 12:30:56
 */
@SuppressWarnings("ConstantConditions")
class MaxSlidingWindow {
    /**
     * Description for MaxSlidingWindow:
     * 滑动窗口的最大值
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        // code
        if (nums.length == 0 || k == 0) return new int[]{};

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int n = nums.length;
        int left = 0, right = k;
        for (int i = 0; i < k; i++) {
            maxHeap.offer(nums[i]);
        }

        int[] ans = new int[n - k + 1];

        while (right < n) {
            ans[left++] = maxHeap.peek();
            maxHeap.remove(nums[left - 1]);
            maxHeap.offer(nums[right++]);
        }

        ans[left] = maxHeap.peek();

        return ans;
    }
}
