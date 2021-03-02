package com.raphael.lc.p264;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-01 20:27:38
 */
class NthUglyNumberTest {

    private final NthUglyNumber solution = new NthUglyNumber();

    @Test
    void t1() {
        Assertions.assertEquals(12, solution.nthUglyNumber(10));
    }
}
