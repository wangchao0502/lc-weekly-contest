package com.raphael.lc.offer20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-15 14:45:48
 */
class IsNumberTest {

    private final IsNumber solution = new IsNumber();

    @Test
    void t1() {
        Assertions.assertTrue(solution.isNumber("+100"));
        Assertions.assertTrue(solution.isNumber("5e2"));
        Assertions.assertTrue(solution.isNumber("-123"));
        Assertions.assertTrue(solution.isNumber("3.1415"));
        Assertions.assertTrue(solution.isNumber("-1E-16"));
        Assertions.assertTrue(solution.isNumber("0123"));
        Assertions.assertFalse(solution.isNumber("12e"));
        Assertions.assertFalse(solution.isNumber("1a3.14"));
        Assertions.assertFalse(solution.isNumber("1.2.3"));
        Assertions.assertFalse(solution.isNumber("+-5"));
        Assertions.assertFalse(solution.isNumber("12e+5.4"));
    }
}
