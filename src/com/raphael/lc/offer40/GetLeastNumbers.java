package com.raphael.lc.offer40;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Raphael
 * @date 2021-03-17 11:56:44
 */
class GetLeastNumbers {
    /**
     * Description for GetLeastNumbers:
     * 最小的k个数
     */
    @SuppressWarnings("ConstantConditions")
    public int[] getLeastNumbers(int[] arr, int k) {
        // code
        if (k == 0) return new int[]{};

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int n : arr) {
            maxHeap.offer(n);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = maxHeap.poll();
        }

        return ans;
    }
}
