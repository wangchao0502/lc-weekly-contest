package com.raphael.lc.p227;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-11 10:23:08
 */
class CalculateTest {

    private final Calculate solution = new Calculate();

    @Test
    void t1() {
        Assertions.assertEquals(7, solution.calculate("3+2*2"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(1, solution.calculate(" 3/2 "));
    }

    @Test
    void t3() {
        Assertions.assertEquals(5, solution.calculate(" 3+5 / 2 "));
    }
}
