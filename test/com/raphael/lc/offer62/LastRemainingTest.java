package com.raphael.lc.offer62;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-22 13:34:13
 */
class LastRemainingTest {

    private final LastRemaining solution = new LastRemaining();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.lastRemaining(5, 3));
    }

    @Test
    void t2() {
        Assertions.assertEquals(2, solution.lastRemaining(10, 17));
    }
}
