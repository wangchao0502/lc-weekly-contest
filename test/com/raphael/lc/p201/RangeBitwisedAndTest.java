package com.raphael.lc.p201;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-23 10:48:58
 */
class RangeBitwisedAndTest {

    private final RangeBitwisedAnd solution = new RangeBitwisedAnd();

    @Test
    void t1() {
        Assertions.assertEquals(4, solution.rangeBitwisedAnd(5, 7));
    }

    @Test
    void t2() {
        Assertions.assertEquals(0, solution.rangeBitwisedAnd(0, 0));
    }

    @Test
    void t3() {
        Assertions.assertEquals(0, solution.rangeBitwisedAnd(1, 2147483647));
    }
}
