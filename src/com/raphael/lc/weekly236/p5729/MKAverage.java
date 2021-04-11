package com.raphael.lc.weekly236.p5729;

import java.util.*;

/**
 * @author Raphael
 * @date 2021-04-11 11:39:08
 */
@SuppressWarnings({"ConstantConditions", "AlibabaLowerCamelCaseVariableNaming"})
class MKAverage {
    /**
     * Description for MKAverage:
     * 求出MK平均值
     */

    int capacity;
    int topK;
    int sum;
    Map<Integer, Integer> removeCacheMinHeap;
    Map<Integer, Integer> removeCacheMaxHeap;
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    Queue<Integer> container;

    public MKAverage(int m, int k) {
        capacity = m;
        topK = k;
        sum = 0;
        removeCacheMinHeap = new HashMap<>();
        removeCacheMaxHeap = new HashMap<>();
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        container = new LinkedList<>();
    }

    public void addElement(int num) {
        container.offer(num);
        minHeap.offer(num);
        maxHeap.offer(num);
        sum += num;
        if (container.size() > capacity) {
            // remove element
            int removeNum = container.poll();
            sum -= removeNum;
            removeCacheMinHeap.put(removeNum, removeCacheMinHeap.getOrDefault(removeNum, 0) + 1);
            removeCacheMaxHeap.put(removeNum, removeCacheMaxHeap.getOrDefault(removeNum, 0) + 1);
        }
    }

    public int calculateMKAverage() {
        if (container.size() < capacity) {
            return -1;
        }
        // lazy remove old number
        int count = topK;
        int total = sum;
        Queue<Integer> removeFromMinHeap = new LinkedList<>();
        Queue<Integer> removeFromMaxHeap = new LinkedList<>();
        while (count > 0) {
            while (removeCacheMinHeap.containsKey(minHeap.peek())) {
                int n = minHeap.poll();
                removeCacheMinHeap.put(n, removeCacheMinHeap.get(n) - 1);
                if (removeCacheMinHeap.get(n) == 0) {
                    removeCacheMinHeap.remove(n);
                }
            }
            int minValue = minHeap.poll();
            removeFromMinHeap.offer(minValue);
            total -= minValue;
            while (removeCacheMaxHeap.containsKey(maxHeap.peek())) {
                int n = maxHeap.poll();
                removeCacheMaxHeap.put(n, removeCacheMaxHeap.get(n) - 1);
                if (removeCacheMaxHeap.get(n) == 0) {
                    removeCacheMaxHeap.remove(n);
                }
            }
            int maxValue = maxHeap.poll();
            removeFromMaxHeap.offer(maxValue);
            total -= maxValue;
            count--;
        }

        while (!removeFromMinHeap.isEmpty()) {
            minHeap.offer(removeFromMinHeap.poll());
        }

        while (!removeFromMaxHeap.isEmpty()) {
            maxHeap.offer(removeFromMaxHeap.poll());
        }

        return total / (capacity - topK * 2);
    }
}
