package com.raphael.lc.p480;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author raphael
 * @date 2021-02-03 11:03:03
 */
class MedianSlidingWindow {
    /**
     * Description for MedianSlidingWindow:
     * 滑动窗口中位数 双堆 延迟删除
     */
    @SuppressWarnings("ConstantConditions")
    private static class DualHeap {
        // 小根堆，堆顶为大于中位数的值
        PriorityQueue<Integer> large;
        // 大根堆，堆顶为小于等于中位数的值
        PriorityQueue<Integer> small;
        // 延迟删除数字，并记录数字个数
        Map<Integer, Integer> delayed;
        // 总长度
        int k;
        // 两个堆数字个数
        int smallSize = 0, largeSize = 0;

        public DualHeap(int k) {
            this.k = k;
            this.small = new PriorityQueue<>(Comparator.reverseOrder());
            this.large = new PriorityQueue<>(Comparator.naturalOrder());
            this.delayed = new HashMap<>();
        }

        // 插入数字
        private void insert(int n) {
            if (small.isEmpty() || n <= small.peek()) {
                small.offer(n);
                smallSize++;
            } else {
                large.offer(n);
                largeSize++;
            }
            makeBalance();
        }

        // 删除数字
        private void erase(int n) {
            delayed.put(n, delayed.getOrDefault(n, 0) + 1);
            if (n <= small.peek()) {
                smallSize--;
                if (small.peek() == n) {
                    prune(small);
                }
            } else {
                largeSize--;
                if (large.peek() == n) {
                    prune(large);
                }
            }
            makeBalance();
        }

        // 延迟删除标记清除的数据
        private void prune(PriorityQueue<Integer> heap) {
            while (!heap.isEmpty()) {
                int num = heap.peek();
                if (delayed.containsKey(num)) {
                    delayed.put(num, delayed.get(num) - 1);
                    if (delayed.get(num) == 0) {
                        delayed.remove(num);
                    }
                    heap.poll();
                } else {
                    break;
                }
            }
        }

        // 获取中位数
        private double getMedian() {
            return (k & 1) == 1 ? small.peek() : ((double) small.peek() + large.peek()) / 2;
        }

        private void makeBalance() {
            // 让两个堆数量相等，或小堆比大堆多一个
            if (smallSize > largeSize + 1) {
                // small 比 large 元素多 2 个
                large.offer(small.poll());
                smallSize--;
                largeSize++;
                prune(small);
            } else if (largeSize > smallSize) {
                // small 比 large 元素少 1 个
                small.offer(large.poll());
                largeSize--;
                smallSize++;
                prune(large);
            }
        }
    }

    public double[] medianSlidingWindow(int[] nums, int k) {
        // code
        int n = nums.length;
        DualHeap dh = new DualHeap(k);
        double[] ans = new double[n - k + 1];
        for (int i = 0; i < k; i++) {
            dh.insert(nums[i]);
        }
        ans[0] = dh.getMedian();
        for (int i = k; i < n; i++) {
            dh.insert(nums[i]);
            dh.erase(nums[i - k]);
            ans[i - k + 1] = dh.getMedian();
        }
        return ans;
    }
}
