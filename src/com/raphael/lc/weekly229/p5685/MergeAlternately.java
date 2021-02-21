package com.raphael.lc.weekly229.p5685;

/**
 * @author Raphael
 * @date 2021-02-21 10:30:37
 */
class MergeAlternately {
    /**
     * Description for MergeAlternately:
     */
    public String mergeAlternately(String word1, String word2) {
        // code
        // word2 longer
        boolean isSwap = false;
        if (word1.length() > word2.length()) {
            String tmp = word1;
            word1 = word2;
            word2 = tmp;
            isSwap = true;
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < word1.length()) {
            if (isSwap) {
                sb.append(word2.charAt(i));
                sb.append(word1.charAt(i));
            } else {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            i++;
        }

        int k = word1.length();
        while (k < word2.length()) {
            sb.append(word2.charAt(k));
            k++;
        }
        return sb.toString();
    }
}
