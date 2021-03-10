package com.raphael.lc.offer09;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-10 13:29:43
 */
class CQueue {
    /**
     * Description for CQueue:
     * 用两个栈实现队列
     */

    Stack<Integer> addStack;
    Stack<Integer> popStack;

    public CQueue() {
        addStack = new Stack<>();
        popStack = new Stack<>();
    }

    public void appendTail(int value) {
        addStack.push(value);
    }

    public int deleteHead() {
        if (popStack.isEmpty()) {
            if (addStack.isEmpty()) return -1;
            while (!addStack.isEmpty()) {
                popStack.push(addStack.pop());
            }
        }
        return popStack.pop();
    }
}
