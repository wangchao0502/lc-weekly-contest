package com.raphael.lc.offer41;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Raphael
 * @date 2021-03-18 17:34:04
 */
@SuppressWarnings("ConstantConditions")
class MedianFinder {
    /**
     * Description for MedianFinder:
     * 数据流中的中位数
     */

    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    int size;

    public MedianFinder() {
        size = 0;
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        size++;
        if ((size & 1) == 1) {
            // 奇数，放在左边
            if (minHeap.size() > 0) {
                if (num < minHeap.peek()) {
                    maxHeap.add(num);
                } else {
                    maxHeap.add(minHeap.poll());
                    minHeap.add(num);
                }
            } else {
                // 第一个
                maxHeap.add(num);
            }
        } else {
            if (maxHeap.peek() > num) {
                minHeap.add(maxHeap.poll());
                maxHeap.add(num);
            } else {
                minHeap.add(num);
            }
        }
    }

    public double findMedian() {
        if (size == 0) return 0;
        if (size == 1) return (double) maxHeap.peek();
        if ((size & 1) == 1) return (double) maxHeap.peek();
        return ((double) maxHeap.peek() + minHeap.peek()) / 2;
    }
}
