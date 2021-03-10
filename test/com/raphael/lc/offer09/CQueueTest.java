package com.raphael.lc.offer09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-10 13:29:43
 */
class CQueueTest {
    @Test
    void t1() {
        CQueue obj = new CQueue();
        obj.appendTail(3);
        Assertions.assertEquals(3, obj.deleteHead());
        Assertions.assertEquals(-1, obj.deleteHead());
    }
}
