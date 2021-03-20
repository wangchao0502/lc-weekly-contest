package com.raphael.lc.offer47;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-20 11:57:59
 */
class MaxValueTest {

    private final MaxValue solution = new MaxValue();

    @Test
    void t1() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        Assertions.assertEquals(12, solution.maxValue(grid));
    }
}
