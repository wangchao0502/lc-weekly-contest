package com.raphael.lc.p1111;

/**
 * @author Raphael
 * @date 2021-04-17 10:30:09
 */
class MaxDepthAfterSplit {
    /**
     * Description for MaxDepthAfterSplit:
     * 有效括号的嵌套深度
     */
    public int[] maxDepthAfterSplit(String seq) {
        // code
        int[] ans = new int[seq.length()];

        for (int i = 0; i < seq.length(); i++) {
            ans[i] = seq.charAt(i) == '(' ? (i & 1) : ((i + 1) & 1);
        }

        return ans;
    }
}
