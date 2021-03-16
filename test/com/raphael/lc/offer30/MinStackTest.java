package com.raphael.lc.offer30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-16 16:38:03
 */
class MinStackTest {
    @Test
    void t1() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assertions.assertEquals(-3, minStack.min());
        minStack.pop();
        Assertions.assertEquals(0, minStack.top());
        Assertions.assertEquals(-2, minStack.min());
    }
}
