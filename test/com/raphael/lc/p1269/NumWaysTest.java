package com.raphael.lc.p1269;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-13 10:42:38
 */
class NumWaysTest {

    private final NumWays solution = new NumWays();

    @Test
    void t1() {
        Assertions.assertEquals(4, solution.numWays(3, 2));
    }

    @Test
    void t2() {
        Assertions.assertEquals(2, solution.numWays(2, 4));
    }

    @Test
    void t3() {
        Assertions.assertEquals(8, solution.numWays(4, 2));
    }
}
