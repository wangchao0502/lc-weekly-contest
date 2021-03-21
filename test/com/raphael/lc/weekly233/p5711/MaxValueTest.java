package com.raphael.lc.weekly233.p5711;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-21 11:27:33
 */
class MaxValueTest {

    private final MaxValue solution = new MaxValue();

    @Test
    void t1() {
        Assertions.assertEquals(2, solution.maxValue(4, 2, 6));
    }

    @Test
    void t2() {
        Assertions.assertEquals(3, solution.maxValue(6, 1, 10));
    }

    @Test
    void t3() {
        Assertions.assertEquals(4, solution.maxValue(4, 0, 10));
    }

    @Test
    void t4() {
        Assertions.assertEquals(3, solution.maxValue(4, 1, 10));
    }
}
