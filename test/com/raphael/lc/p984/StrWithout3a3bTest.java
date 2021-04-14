package com.raphael.lc.p984;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-14 11:34:12
 */
class StrWithout3a3bTest {

    private final StrWithout3a3b solution = new StrWithout3a3b();

    @Test
    void t1() {
        Assertions.assertEquals("bba", solution.strWithout3a3b(1, 2));
    }

    @Test
    void t2() {
        Assertions.assertEquals("aabaa", solution.strWithout3a3b(4, 1));
    }

    @Test
    void t3() {
        Assertions.assertEquals("bbabbab", solution.strWithout3a3b(2, 5));
    }

    @Test
    void t4() {
        Assertions.assertEquals("bbaba", solution.strWithout3a3b(2, 3));
    }
}
