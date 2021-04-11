package com.raphael.lc.weekly236.p5728;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-11 10:58:49
 */
class MinSideJumpsTest {

    private final MinSideJumps solution = new MinSideJumps();

    @Test
    void t1() {
        int[] obstacles = {0, 1, 1, 3, 3, 0};
        Assertions.assertEquals(0, solution.minSideJumps(obstacles));
    }

    @Test
    void t2() {
        int[] obstacles = {0, 1, 2, 3, 0};
        Assertions.assertEquals(2, solution.minSideJumps(obstacles));
    }

    @Test
    void t3() {
        int[] obstacles = {0, 2, 1, 0, 3, 0};
        Assertions.assertEquals(2, solution.minSideJumps(obstacles));
    }
}
