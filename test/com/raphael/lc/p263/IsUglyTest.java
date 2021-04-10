package com.raphael.lc.p263;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-10 10:00:38
 */
class IsUglyTest {

    private final IsUgly solution = new IsUgly();

    @Test
    void t1() {
        Assertions.assertTrue(solution.isUgly(6));
    }

    @Test
    void t2() {
        Assertions.assertTrue(solution.isUgly(8));
    }

    @Test
    void t3() {
        Assertions.assertFalse(solution.isUgly(14));
    }

    @Test
    void t4() {
        Assertions.assertTrue(solution.isUgly(1));
    }
}

