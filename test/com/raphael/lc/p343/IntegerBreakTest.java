package com.raphael.lc.p343;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-03 11:33:38
 */
class IntegerBreakTest {

    private final IntegerBreak solution = new IntegerBreak();

    @Test
    void t1() {
        Assertions.assertEquals(1, solution.integerBreak(2));
    }

    @Test
    void t2() {
        Assertions.assertEquals(36, solution.integerBreak(10));
    }
}
