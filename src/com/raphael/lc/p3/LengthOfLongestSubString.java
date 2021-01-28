package com.raphael.lc.p3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author raphael
 * @date 2021-01-28 22:15:40
 */
class LengthOfLongestSubString {
    /**
     * Description for LengthOfLongestSubString:
     * 无重复字符的最长子串
     */
    public int lengthOfLongestSubString(String s) {
        // code
        Map<Character, Integer> map = new HashMap<>(16);
        int n = s.length();
        int k = -1;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) && map.get(c) > k) {
                k = map.get(c);
                map.put(c, i);
            } else {
                map.put(c, i);
                ans = Math.max(ans, i - k);
            }
        }
        return ans;
    }
}
