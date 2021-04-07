package com.raphael.lc.p347;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author Raphael
 * @date 2021-04-07 12:12:42
 */
@SuppressWarnings({"AlibabaLowerCamelCaseVariableNaming", "ConstantConditions"})
class TopKFrequent {
    /**
     * Description for TopKFrequent:
     * 前K个高频元素
     */
    public int[] topKFrequent(int[] nums, int k) {
        // code
        Map<Integer, Integer> count = new HashMap<>(16);
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> count.get(o2) - count.get(o1));
        int[] ans = new int[k];
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        heap.addAll(count.keySet());
        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }
        return ans;
    }
}
