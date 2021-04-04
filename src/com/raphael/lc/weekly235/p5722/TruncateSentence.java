package com.raphael.lc.weekly235.p5722;

/**
 * @author Raphael
 * @date 2021-04-04 10:31:52
 */
class TruncateSentence {
    /**
     * Description for TruncateSentence:
     * 截断句子
     */
    public String truncateSentence(String s, int k) {
        // code
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(strs[i]);
            if (i != k - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
