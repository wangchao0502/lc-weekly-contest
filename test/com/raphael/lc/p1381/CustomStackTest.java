package com.raphael.lc.p1381;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-01 12:55:10
 */
class CustomStackTest {
    @Test
    void t1() {
        CustomStack stack = new CustomStack(3);
        stack.push(1);
        stack.push(2);
        Assertions.assertEquals(2, stack.pop());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.increment(5, 100);
        stack.increment(2, 100);
        Assertions.assertEquals(103, stack.pop());
        Assertions.assertEquals(202, stack.pop());
        Assertions.assertEquals(201, stack.pop());
        Assertions.assertEquals(-1, stack.pop());
    }
}
