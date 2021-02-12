package com.raphael.lc.p58;

/**
 * @author raphael
 * @date 2021-02-12 12:11:40
 */
class LengthOfLastWord {
    /**
     * Description for LengthOfLastWord:
     * 最后一个单词的长度
     */
    public int lengthOfLastWord(String s) {
        // code
        char[] chars = s.toCharArray();
        int ans = 0;
        int n = s.length();
        int k = n - 1;

        while (k >= 0 && chars[k] == ' ') {
            k--;
        }

        for (int i = k; i >= 0; i--) {
            if (chars[i] != ' ') {
                ans++;
            } else {
                return ans;
            }
        }

        return ans;
    }
}
