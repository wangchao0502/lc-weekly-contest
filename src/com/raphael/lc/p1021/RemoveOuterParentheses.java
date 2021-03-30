package com.raphael.lc.p1021;

/**
 * @author Raphael
 * @date 2021-03-30 14:37:57
 */
class RemoveOuterParentheses {
    /**
     * Description for RemoveOuterParentheses:
     * 删除最外层的括号
     */
    public String removeOuterParentheses(String s) {
        // code
        StringBuilder ans = new StringBuilder();
        int leftCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') leftCount++;
            if (leftCount > 1) ans.append(c);
            if (c == ')') leftCount--;
        }

        return ans.toString();
    }
}
