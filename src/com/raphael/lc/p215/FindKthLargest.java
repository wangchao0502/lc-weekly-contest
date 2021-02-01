package com.raphael.lc.p215;

import java.util.PriorityQueue;

/**
 * @author raphael
 * @date 2021-02-01 17:27:27
 */
class FindKthLargest {
    /**
     * Description for FindKthLargest:
     * 数组中第K个最大元素
     */
    @SuppressWarnings("ConstantConditions")
    public int findKthLargest(int[] nums, int k) {
        // code
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k + 1);
        for (int i = 0; i < k; i++) {
            minHeap.add(nums[i]);
        }
        // 剪掉 len-k 个最小的，剩下最小的就是第 k 大的
        for (int i = k; i < nums.length; i++) {
            minHeap.add(nums[i]);
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
