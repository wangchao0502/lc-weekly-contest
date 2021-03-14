package com.raphael.lc.weekly232.p5701;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-14 10:32:12
 */
class AreAlmostEqualTest {

    private final AreAlmostEqual solution = new AreAlmostEqual();

    @Test
    void t1() {
        Assertions.assertTrue(solution.areAlmostEqual("bank", "kanb"));
    }

    @Test
    void t2() {
        Assertions.assertFalse(solution.areAlmostEqual("attack", "defend"));
    }

    @Test
    void t3() {
        Assertions.assertFalse(solution.areAlmostEqual("abcd", "bcda"));
    }

    @Test
    void t4() {
        Assertions.assertTrue(solution.areAlmostEqual("kelb", "kelb"));
    }

    @Test
    void t5() {
        Assertions.assertFalse(solution.areAlmostEqual("a", "b"));
    }

    @Test
    void t6() {
        Assertions.assertTrue(solution.areAlmostEqual("b", "b"));
    }
}
