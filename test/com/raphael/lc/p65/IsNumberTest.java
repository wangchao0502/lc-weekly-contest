package com.raphael.lc.p65;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-17 11:03:52
 */
class IsNumberTest {

    private final IsNumber solution = new IsNumber();

    @Test
    void t1() {
        Assertions.assertTrue(solution.isNumber("0"));
    }

    @Test
    void t2() {
        Assertions.assertTrue(solution.isNumber(".1"));
    }

    @Test
    void t3() {
        Assertions.assertFalse(solution.isNumber("e"));
    }

    @Test
    void t4() {
        Assertions.assertFalse(solution.isNumber("."));
    }
}
