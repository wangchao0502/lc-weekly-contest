package com.raphael.lc.p30;

import java.util.*;

/**
 * @author raphael
 * @date 2021-02-04 14:07:41
 */
class FindSubstring {
    /**
     * Description for FindSubstring:
     * 串联所有单词的子串
     */
    public List<Integer> findSubstring(String s, String[] words) {
        // code
        List<Integer> res = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) return res;
        HashMap<String, Integer> map = new HashMap<>(16);
        int k = words[0].length();
        int needCount = words.length;
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (int i = 0; i < k; i++) {
            int left = i, right = i, count = 0;
            HashMap<String, Integer> wordCount = new HashMap<>(16);
            while (right + k <= s.length()) {
                String w = s.substring(right, right + k);
                right += k;
                if (!map.containsKey(w)) {
                    count = 0;
                    left = right;
                    wordCount.clear();
                } else {
                    wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
                    count++;
                    while (wordCount.getOrDefault(w, 0) > map.getOrDefault(w, 0)) {
                        String leftWord = s.substring(left, left + k);
                        count--;
                        wordCount.put(leftWord, wordCount.getOrDefault(leftWord, 0) - 1);
                        left += k;
                    }
                    if (count == needCount) res.add(left);
                }
            }
        }
        return res;
    }
}
