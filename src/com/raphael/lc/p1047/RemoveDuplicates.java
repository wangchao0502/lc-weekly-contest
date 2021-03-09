package com.raphael.lc.p1047;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-09 13:47:33
 */
class RemoveDuplicates {
    /**
     * Description for RemoveDuplicates:
     * 删除字符串中的所有相邻重复项
     */
    public String removeDuplicates(String s) {
        // code
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
