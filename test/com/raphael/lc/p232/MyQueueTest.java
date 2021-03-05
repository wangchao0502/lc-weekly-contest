package com.raphael.lc.p232;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-05 14:34:20
 */
class MyQueueTest {
    @Test
    void t1() {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        Assertions.assertEquals(1, obj.peek());
        Assertions.assertEquals(1, obj.pop());
        Assertions.assertFalse(obj.empty());
    }
}
