package com.raphael.lc.mst0304;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-04-05 11:37:46
 */
class MyQueue {
    /**
     * Description for MyQueue:
     * 化栈为队
     */

    Stack<Integer> s1;
    Stack<Integer> s2;
    int size = 0;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
        size++;
    }

    public int pop() {
        if (peek() == -1) return -1;
        size--;
        return s2.pop();
    }

    public int peek() {
        if (empty()) return -1;
        if (size > 0 && s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        return size == 0;
    }
}
