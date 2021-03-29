package com.raphael.lc.p946;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-29 18:14:59
 */
class ValidateStackSequences {
    /**
     * Description for ValidateStackSequences:
     * 验证栈序列
     */
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // code
        int n = pushed.length;
        int p1 = 0, p2 = 0;
        Stack<Integer> stack = new Stack<>();

        while (p2 < n) {
            while (p1 < n && (stack.isEmpty() || stack.peek() != popped[p2])) {
                stack.push(pushed[p1++]);
            }
            if (!stack.isEmpty() && stack.peek() == popped[p2++]) {
                stack.pop();
            } else {
                return false;
            }
        }

        return true;
    }
}
