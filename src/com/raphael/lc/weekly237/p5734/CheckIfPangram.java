package com.raphael.lc.weekly237.p5734;

/**
 * @author Raphael
 * @date 2021-04-18 10:32:43
 */
class CheckIfPangram {
    /**
     * Description for CheckIfPangram:
     * 判断句子是否全字母句
     */
    public boolean checkIfPangram(String sentence) {
        // code
        int n = sentence.length();
        boolean[] vis = new boolean[26];

        for (int i = 0; i < n; i++) {
            vis[sentence.charAt(i) - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!vis[i]) {
                return false;
            }
        }

        return true;
    }
}
