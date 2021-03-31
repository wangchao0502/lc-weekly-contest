package com.raphael.lc.p1190;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-31 13:56:31
 */
class ReverseParentheses {
    /**
     * Description for ReverseParentheses:
     * 反转每对括号间的子串
     */
    public String reverseParentheses(String s) {
        // code
        StringBuilder sb = new StringBuilder();
        Stack<StringBuilder> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(sb);
                sb = new StringBuilder();
            } else if (c == ')') {
                StringBuilder tmp = sb.reverse();
                sb = new StringBuilder();
                if (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(tmp);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
