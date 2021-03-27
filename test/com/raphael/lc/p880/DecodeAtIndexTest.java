package com.raphael.lc.p880;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-27 17:23:22
 */
class DecodeAtIndexTest {

    private final DecodeAtIndex solution = new DecodeAtIndex();

    @Test
    void t1() {
        Assertions.assertEquals("o", solution.decodeAtIndex("leet2code3", 10));
    }

    @Test
    void t2() {
        Assertions.assertEquals("h", solution.decodeAtIndex("ha22", 5));
    }

    @Test
    void t3() {
        Assertions.assertEquals("a", solution.decodeAtIndex("a2345678999999999999999", 1));
    }

    @Test
    void t4() {
        Assertions.assertEquals("c", solution.decodeAtIndex("a2b3c4d5e6f7g8h9", 10));
    }

    @Test
    void t5() {
        Assertions.assertEquals("y", solution.decodeAtIndex("y959q969u3hb22odq595", 222280369));
    }
}
