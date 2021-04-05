package com.raphael.lc.mst0304;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-05 11:37:46
 */
class MyQueueTest {
    @Test
    void t1() {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        Assertions.assertEquals(1, queue.peek());
        Assertions.assertEquals(1, queue.pop());
        Assertions.assertFalse(queue.empty());
    }
}
