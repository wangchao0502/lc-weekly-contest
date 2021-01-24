package com.raphael.lc.weekly225.p5661;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-24 10:36:28
 */
class MaximumTimeTest {

    private final MaximumTime solution = new MaximumTime();

    @Test
    void t1() {
        Assertions.assertEquals("23:50", solution.maximumTime("2?:?0"));
    }

    @Test
    void t2() {
        Assertions.assertEquals("09:39", solution.maximumTime("0?:3?"));
    }

    @Test
    void t3() {
        Assertions.assertEquals("19:22", solution.maximumTime("1?:22"));
    }
}
