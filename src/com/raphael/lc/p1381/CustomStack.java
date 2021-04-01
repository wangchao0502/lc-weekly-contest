package com.raphael.lc.p1381;

/**
 * @author Raphael
 * @date 2021-04-01 12:55:10
 */
class CustomStack {
    /**
     * Description for CustomStack:
     * 设计一个支持增量操作的栈
     */

    int capacity;
    int ptr;
    int[] stack;

    public CustomStack(int maxSize) {
        capacity = maxSize;
        ptr = 0;
        stack = new int[capacity];
    }

    public void push(int x) {
        if (ptr == capacity) {
            return;
        }
        stack[ptr++] = x;
    }

    public int pop() {
        if (ptr == 0) {
            return -1;
        }
        return stack[--ptr];
    }

    public void increment(int k, int val) {
        int i = 0;
        while (i < Math.min(ptr, k)) {
            stack[i++] += val;
        }
    }
}
