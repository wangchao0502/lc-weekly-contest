package com.raphael.lc.p692;

import java.util.*;

/**
 * @author Raphael
 * @date 2021-04-07 11:46:52
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
class TopKFrequent {
    /**
     * Description for TopKFrequent:
     * 前K个高频单词
     */
    public List<String> topKFrequent(String[] words, int k) {
        // code
        List<String> ans = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>(16);
        PriorityQueue<String> heap = new PriorityQueue<>((o1, o2) -> {
            int c1 = count.get(o1);
            int c2 = count.get(o2);
            if (c1 != c2) {
                return c2 - c1;
            } else {
                return o1.compareTo(o2);
            }
        });

        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        heap.addAll(count.keySet());
        for (int i = 0; i < k; i++) {
            ans.add(heap.poll());
        }

        return ans;
    }
}
