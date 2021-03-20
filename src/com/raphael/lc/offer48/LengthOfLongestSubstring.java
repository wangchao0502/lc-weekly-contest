package com.raphael.lc.offer48;

/**
 * @author Raphael
 * @date 2021-03-20 12:07:53
 */
class LengthOfLongestSubstring {
    /**
     * Description for LengthOfLongestSubstring:
     * 最长不含重复字符的子字符串
     */
    public int lengthOfLongestSubstring(String s) {
        // code
        int n = s.length();
        if (n == 0) return 0;

        int[] letter = new int[26];
        int left = 0, right = 0;
        int ans = 0;

        while (right < n) {
            char c = s.charAt(right);

            if (letter[c - 'a'] > 0) {
                // move left
                while (s.charAt(left) != c) {
                    letter[s.charAt(left) - 'a'] = 0;
                    left++;
                }
                left++;
            } else {
                letter[c - 'a']++;
            }
            right++;
            ans = Math.max(ans, right - left);
        }

        return ans;
    }
}
