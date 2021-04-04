package com.raphael.lc.p781;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-04 11:52:41
 */
class NumRabbitsTest {

    private final NumRabbits solution = new NumRabbits();

    @Test
    void t1() {
        Assertions.assertEquals(5, solution.numRabbits(new int[]{1, 1, 2}));
    }

    @Test
    void t2() {
        Assertions.assertEquals(11, solution.numRabbits(new int[]{10, 10, 10}));
    }

    @Test
    void t3() {
        Assertions.assertEquals(0, solution.numRabbits(new int[]{}));
    }
}
