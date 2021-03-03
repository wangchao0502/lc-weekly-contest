package com.raphael.lc.p357;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-03 17:26:16
 */
class CountNumbersWithUniqueDigitsTest {

    private final CountNumbersWithUniqueDigits solution = new CountNumbersWithUniqueDigits();

    @Test
    void t1() {
        Assertions.assertEquals(91, solution.countNumbersWithUniqueDigits(2));
    }

    @Test
    void t2() {
        Assertions.assertEquals(1, solution.countNumbersWithUniqueDigits(0));
    }

    @Test
    void t3() {
        Assertions.assertEquals(739, solution.countNumbersWithUniqueDigits(3));
    }
}
