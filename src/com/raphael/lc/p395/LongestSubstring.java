package com.raphael.lc.p395;

/**
 * @author raphael
 * @date 2021-02-03 22:23:57
 */
class LongestSubstring {
    /**
     * Description for LongestSubstring:
     * 至少有K个重复字符的最长子串
     */
    @SuppressWarnings("AlibabaUndefineMagicConstant")
    public int longestSubstring(String s, int k) {
        // code, 循环26次，滑动窗口
        int ans = 0;

        for (int i = 1; i <= 26; i++) {
            int[] record = new int[26];
            int left = 0, right = 0;
            // 字符个数，满足要求的字符个数
            int diffCount = 0, count = 0;
            while (right < s.length()) {
                int addIndex = s.charAt(right) - 'a';
                record[addIndex] += 1;
                if (record[addIndex] == 1) {
                    diffCount++;
                }
                if (record[addIndex] == k) {
                    count++;
                }
                right++;

                // 字符个数超过i，进行缩减窗口
                while (left < right && diffCount > i) {
                    int delIndex = s.charAt(left) - 'a';
                    if (record[delIndex] == k) {
                        count--;
                    }
                    if (record[delIndex] == 1) {
                        diffCount--;
                    }
                    record[delIndex] -= 1;
                    left++;
                }
                if (diffCount == i && diffCount == count) {
                    ans = Math.max(ans, right - left);
                }
            }
        }
        return ans;
    }
}
