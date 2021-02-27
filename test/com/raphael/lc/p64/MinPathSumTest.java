package com.raphael.lc.p64;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-25 15:38:40
 */
class MinPathSumTest {

    private final MinPathSum solution = new MinPathSum();

    @Test
    void t1() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        Assertions.assertEquals(7, solution.minPathSum(grid));
    }
}
