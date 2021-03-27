package com.raphael.lc.p856;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-27 15:56:19
 */
class ScoreOfParentheses {
    /**
     * Description for ScoreOfParentheses:
     * 括号的分数
     */
    public int scoreOfParentheses(String s) {
        // code
        Stack<Integer> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (c == '(') {
                // 0表示左括号
                stack.push(0);
            } else {
                int top = 1;
                if (stack.peek() != 0) {
                    top = stack.pop() * 2;
                }
                stack.pop();
                while (!stack.isEmpty() && stack.peek() != 0) {
                    top += stack.pop();
                }
                stack.push(top);
            }
        }

        return stack.pop();
    }
}
