package com.raphael.lc.p921;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-27 17:51:43
 */
class MinAddToMakeValid {
    /**
     * Description for MinAddToMakeValid:
     * 使括号有效的最少添加
     */
    public int minAddToMakeValid(String s) {
        // code
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.size();
    }
}
