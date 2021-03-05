package com.raphael.lc.p232;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-05 14:34:20
 */
class MyQueue {
    /**
     * Description for MyQueue:
     */

    Stack<Integer> fromStack;
    Stack<Integer> toStack;
    int size;

    public MyQueue() {
        fromStack = new Stack<>();
        toStack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        fromStack.push(x);
        size++;
    }

    private void moveStack() {
        while (!fromStack.isEmpty()) {
            toStack.push(fromStack.pop());
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (this.empty()) return -1;
        if (toStack.isEmpty()) {
            moveStack();
        }
        size--;
        return toStack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (this.empty()) return -1;
        if (toStack.isEmpty()) {
            moveStack();
        }
        return toStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return size == 0;
    }
}
