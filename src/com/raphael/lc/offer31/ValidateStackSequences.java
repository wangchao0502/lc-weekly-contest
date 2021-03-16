package com.raphael.lc.offer31;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-16 16:52:31
 */
class ValidateStackSequences {
    /**
     * Description for ValidateStackSequences:
     * 栈的压入、弹出序列
     */
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // code
        Stack<Integer> stack = new Stack<>();
        int ptr = 0;

        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popped[ptr]) {
                stack.pop();
                ptr++;
            }
        }

        return stack.isEmpty();
    }
}
