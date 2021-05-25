package com.raphael.lc.p1614;

/**
 * @author Raphael
 * @date 2021-05-25 12:57:10
 */
class MaxDepth {
    /**
     * Description for MaxDepth:
     * 括号的最大嵌套深度
     */
    public int maxDepth(String s) {
        int depth = 0;
        int max = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                depth++;
                max = Math.max(depth, max);
            } else if (c == ')') {
                depth--;
            }
        }
        return max;
    }
}
