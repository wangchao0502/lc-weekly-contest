package com.raphael.lc.p947;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-15 20:47:23
 */
class RemoveStonesTest {

    private final RemoveStones solution = new RemoveStones();

    @Test
    void t1() {
        int[][] stones = {{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}};
        Assertions.assertEquals(5, solution.removeStones(stones));
    }

    @Test
    void t2() {
        int[][] stones = {{0, 0}, {0, 2}, {1, 1}, {2, 0}, {2, 2}};
        Assertions.assertEquals(3, solution.removeStones(stones));
    }
}
