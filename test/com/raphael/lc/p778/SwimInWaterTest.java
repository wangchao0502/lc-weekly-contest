package com.raphael.lc.p778;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-30 10:14:31
 */
class SwimInWaterTest {

    private final SwimInWater solution = new SwimInWater();

    @Test
    void t1() {
        int[][] grid = {{0, 2}, {1, 3}};
        Assertions.assertEquals(3, solution.swimInWater(grid));
    }

    @Test
    void t2() {
        int[][] grid = {{0, 1, 2, 3, 4}, {24, 23, 22, 21, 5}, {12, 13, 14, 15, 16}, {11, 17, 18, 19, 20}, {10, 9, 8, 7, 6}};
        Assertions.assertEquals(16, solution.swimInWater(grid));
    }
}
