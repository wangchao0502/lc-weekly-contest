package com.raphael.lc.p225;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-23 19:59:05
 */
class MyStackTest {
    @Test
    void t1() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        Assertions.assertEquals(2, stack.top());
        Assertions.assertEquals(2, stack.pop());
        Assertions.assertFalse(stack.empty());
    }
}
