package com.raphael.lc.p991;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-14 11:59:29
 */
class BrokenCalcTest {

    private final BrokenCalc solution = new BrokenCalc();

    @Test
    void t1() {
        Assertions.assertEquals(2, solution.brokenCalc(2, 3));
    }

    @Test
    void t2() {
        Assertions.assertEquals(2, solution.brokenCalc(5, 8));
    }

    @Test
    void t3() {
        Assertions.assertEquals(3, solution.brokenCalc(3, 10));
    }

    @Test
    void t4() {
        Assertions.assertEquals(1023, solution.brokenCalc(1024, 1));
    }

    @Test
    void t5() {
        Assertions.assertEquals(39, solution.brokenCalc(1, 1000000000));
    }
}
