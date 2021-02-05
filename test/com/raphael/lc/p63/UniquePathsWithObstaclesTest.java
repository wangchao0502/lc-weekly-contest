package com.raphael.lc.p63;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-05 16:09:41
 */
class UniquePathsWithObstaclesTest {

    private final UniquePathsWithObstacles solution = new UniquePathsWithObstacles();

    @Test
    void t1() {
        int[][] grid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        Assertions.assertEquals(2, solution.uniquePathsWithObstacles(grid));
    }

    @Test
    void t2() {
        int[][] grid = {{0, 1}, {0, 0}};
        Assertions.assertEquals(1, solution.uniquePathsWithObstacles(grid));
    }
}
