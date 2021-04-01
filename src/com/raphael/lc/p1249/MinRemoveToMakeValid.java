package com.raphael.lc.p1249;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-04-01 12:20:14
 */
class MinRemoveToMakeValid {
    /**
     * Description for MinRemoveToMakeValid:
     * 移除无效的括号
     */
    public String minRemoveToMakeValid(String s) {
        // code
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            } else if (c  == '(') {
                stack.push(i);
            }
        }

        int ptr = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ptr < stack.size() && stack.get(ptr) == i) {
                ptr++;
                continue;
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
