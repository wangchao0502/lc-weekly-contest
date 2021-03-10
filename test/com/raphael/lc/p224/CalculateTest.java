package com.raphael.lc.p224;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-10 10:54:12
 */
class CalculateTest {

    private final Calculate solution = new Calculate();

    @Test
    void t1() {
        Assertions.assertEquals(2, solution.calculate("1 + 1"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(3, solution.calculate(" 2-1 + 2"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(23, solution.calculate("(1+(4+5+2)-3)+(6+8)"));
    }

    @Test
    void t4() {
        Assertions.assertEquals(-1, solution.calculate("-2 + 1"));
    }

    @Test
    void t5() {
        Assertions.assertEquals(-12, solution.calculate("-(3 +(4 + 5))"));
    }
}
