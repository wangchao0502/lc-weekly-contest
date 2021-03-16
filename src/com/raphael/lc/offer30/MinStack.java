package com.raphael.lc.offer30;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-16 16:38:03
 */
class MinStack {
    /**
     * Description for MinStack:
     * 包含min函数的栈
     */

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || minStack.peek() >= x) {
            minStack.push(x);
        }
    }

    public void pop() {
        int x = stack.pop();
        if (minStack.peek() == x) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.isEmpty() ? -1 : stack.peek();
    }

    public int min() {
        return minStack.isEmpty() ? -1 : minStack.peek();
    }
}
