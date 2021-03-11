package com.raphael.lc.offer10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-11 10:36:34
 */
class NumWaysTest {

    private final NumWays solution = new NumWays();

    @Test
    void t1() {
        Assertions.assertEquals(2, solution.numWays(2));
    }

    @Test
    void t2() {
        Assertions.assertEquals(21, solution.numWays(7));
    }

    @Test
    void t3() {
        Assertions.assertEquals(1, solution.numWays(0));
    }
}
