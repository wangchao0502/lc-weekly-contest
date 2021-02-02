package com.raphael.lc.p424;

/**
 * @author raphael
 * @date 2021-02-02 10:14:38
 */
class CharacterReplacement {
    /**
     * Description for CharacterReplacement:
     * 替换后的最长重复字符串
     */
    public int characterReplacement(String s, int k) {
        // code 滑动窗口
        int[] map = new int[26];
        int left = 0;
        int historyCharMax = 0;
        char[] chars = s.toCharArray();

        for (int right = 0; right < chars.length; right++) {
            int index = chars[right] - 'A';
            map[index]++;
            historyCharMax = Math.max(historyCharMax, map[index]);
            if (right - left + 1 > historyCharMax + k) {
                map[chars[left] - 'A']--;
                left++;
            }
        }

        return chars.length - left;
    }
}
