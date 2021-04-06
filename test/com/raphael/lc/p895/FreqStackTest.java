package com.raphael.lc.p895;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-06 11:43:32
 */
class FreqStackTest {
    @Test
    void t1() {
        FreqStack stack = new FreqStack();
        stack.push(5);
        stack.push(7);
        stack.push(5);
        stack.push(7);
        stack.push(4);
        stack.push(5);
        Assertions.assertEquals(5, stack.pop());
        Assertions.assertEquals(7, stack.pop());
        Assertions.assertEquals(5, stack.pop());
        Assertions.assertEquals(4, stack.pop());
    }
}
