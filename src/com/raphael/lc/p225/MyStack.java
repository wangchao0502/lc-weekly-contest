package com.raphael.lc.p225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Raphael
 * @date 2021-03-23 19:59:05
 */
class MyStack {
    /**
     * Description for MyStack:
     * 用队列实现栈
     */

    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        int n = queue.size();
        queue.offer(x);
        for (int i = 0; i < n; i++) {
            queue.offer(queue.poll());
        }
    }

    public int top() {
        return queue.isEmpty() ? -1 : queue.peek();
    }

    public int pop() {
        return queue.isEmpty() ? -1 : queue.poll();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
