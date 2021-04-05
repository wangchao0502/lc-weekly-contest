package com.raphael.lc.mst0302;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-04-05 11:25:21
 */
class MinStack {
    /**
     * Description for MinStack:
     * 栈的最小值
     */

    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
        } else {
            stack.push(Math.min(x, getMin()));
        }
        stack.push(x);
    }

    public void pop() {
        stack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stack.isEmpty() ? -1 : stack.get(stack.size() - 2);
    }
}
