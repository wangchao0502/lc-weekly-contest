package com.raphael.lc.biweekly49.p5706;

/**
 * @author Raphael
 * @date 2021-04-03 22:52:41
 */
class AreSentencesSimilar {
    /**
     * Description for AreSentencesSimilar:
     * 句子相似性2
     */
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        // code
        // make s1 is longer than s2
        if (sentence1.length() < sentence2.length()) {
            String tmp = sentence1;
            sentence1 = sentence2;
            sentence2 = tmp;
        }

        String[] ss1 = sentence1.split(" ");
        String[] ss2 = sentence2.split(" ");

        int left = 0, right = ss2.length - 1;
        while (left < ss2.length && ss1[left].equals(ss2[left])) {
            left++;
        }

        if (left == ss2.length) return true;

        while (right >= left && ss2[right].equals(ss1[ss1.length - ss2.length + right])) {
            right--;
        }

        return left == right + 1;
    }
}
