package com.raphael.lc.offer49;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-20 21:08:00
 */
class NthUglyNumberTest {

    private final NthUglyNumber solution = new NthUglyNumber();

    @Test
    void t1() {
        Assertions.assertEquals(12, solution.nthUglyNumber(10));
    }
}
