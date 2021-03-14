package com.raphael.lc.weekly232.p5703;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-14 10:56:10
 */
class MaxAverageRatioTest {

    private final MaxAverageRatio solution = new MaxAverageRatio();

    @Test
    void t1() {
        int[][] classes = {{1, 2}, {3, 5}, {2, 2}};
        Assertions.assertTrue(Math.abs(solution.maxAverageRatio(classes, 2) - 0.78333) < 0.00001);
    }

    @Test
    void t2() {
        int[][] classes = {{2, 4}, {3, 9}, {4, 5}, {2, 10}};
        Assertions.assertTrue(Math.abs(solution.maxAverageRatio(classes, 4) - 0.53485) < 0.00001);
    }
}
