package com.raphael.lc.p703;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author raphael
 * @date 2021-02-11 10:15:26
 */
class KthLargest {
    /**
     * Description for KthLargest:
     * 数据流中的第 K 大元素
     */
    PriorityQueue<Integer> heap;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<>();
        for (int x : nums) {
            add(x);
        }
    }

    @SuppressWarnings("ConstantConditions")
    public int add(int val) {
        heap.offer(val);
        if (heap.size() > k)  {
            heap.poll();
        }
        return heap.peek();
    }
}
