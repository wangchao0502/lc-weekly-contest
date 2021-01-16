package com.raphael.lc.p803;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-16 15:53:43
 */
class HitBricksTest {

    private final HitBricks solution = new HitBricks();

    @Test
    void t1() {
        int[][] grid = {
                {1, 0, 0, 0},
                {1, 1, 1, 0}
        };
        int[][] hits = {{1, 0}};
        Assertions.assertArrayEquals(new int[]{2}, solution.hitBricks(grid, hits));
    }

    @Test
    void t2() {
        int[][] grid = {
                {1, 0, 1},
                {1, 1, 1}
        };
        int[][] hits = {{0, 0}, {0, 2}, {1, 1}};
        Assertions.assertArrayEquals(new int[]{0, 3, 0}, solution.hitBricks(grid, hits));
    }
}
