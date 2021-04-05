package com.raphael.lc.mst0302;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-05 11:25:21
 */
class MinStackTest {
    @Test
    void t1() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assertions.assertEquals(-3, minStack.getMin());
        minStack.pop();
        Assertions.assertEquals(0, minStack.top());
        Assertions.assertEquals(-2, minStack.getMin());
    }

    @Test
    void t2() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-1);
        Assertions.assertEquals(-2, minStack.getMin());
        Assertions.assertEquals(-1, minStack.top());
        minStack.pop();
        Assertions.assertEquals(-2, minStack.getMin());
    }
}
