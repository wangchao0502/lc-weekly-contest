package com.raphael.lc.weekly234.p5713;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-28 10:31:00
 */
class NumDifferentIntegersTest {

    private final NumDifferentIntegers solution = new NumDifferentIntegers();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.numDifferentIntegers("a123bc34d8ef34"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(2, solution.numDifferentIntegers("leet1234code234"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(1, solution.numDifferentIntegers("a1b01c001"));
    }

    @Test
    void t4() {
        Assertions.assertEquals(0, solution.numDifferentIntegers("a"));
    }
}
