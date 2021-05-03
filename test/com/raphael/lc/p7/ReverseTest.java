package com.raphael.lc.p7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-03 10:52:21
 */
class ReverseTest {

    private final Reverse solution = new Reverse();

    @Test
    void t1() {
        Assertions.assertEquals(321, solution.reverse(123));
    }

    @Test
    void t2() {
        Assertions.assertEquals(-321, solution.reverse(-123));
    }

    @Test
    void t3() {
        Assertions.assertEquals(21, solution.reverse(120));
    }

    @Test
    void t4() {
        Assertions.assertEquals(0, solution.reverse(0));
    }

    @Test
    void t5() {
        Assertions.assertEquals(0, solution.reverse(1534236469));
    }
}
