package com.raphael.lc.p76;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author raphael
 * @date 2021-02-02 11:45:15
 */
class MinWindow {
    /**
     * Description for MinWindow:
     * 最小覆盖子串
     */
    public String minWindow(String s, String t) {
        // code sliding window
        // 初始化
        Map<Character, Integer> need = new HashMap<>(16);
        Map<Character, Integer> window = new HashMap<>(16);
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int valid = 0;
        int start = 0, minLen = Integer.MAX_VALUE;
        // 寻找可行解，不断增加窗口右边界，right++，将新数据加入窗口，直到满足条件
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            // 优化可行解，收缩左边界
            while (valid == need.size()) {
                // 更新最优解
                if (right - left < minLen) {
                    start = left;
                    minLen = right - left;
                }

                char c1 = s.charAt(left);
                // 丢掉一个最左边的值
                left++;
                if (need.containsKey(c1)) {
                    if (window.get(c1).equals(need.get(c1))) {
                        valid--;
                    }
                    window.put(c1, window.get(c1) - 1);
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
