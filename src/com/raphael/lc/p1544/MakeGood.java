package com.raphael.lc.p1544;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-04-03 14:04:17
 */
class MakeGood {
    /**
     * Description for MakeGood:
     * 整理字符串
     */
    public String makeGood(String s) {
        // code
        int delta = Math.abs('A' - 'a');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && c != stack.peek() && Math.abs(c - stack.peek()) == delta) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
