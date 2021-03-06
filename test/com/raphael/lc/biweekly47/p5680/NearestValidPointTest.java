package com.raphael.lc.biweekly47.p5680;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-06 22:31:48
 */
class NearestValidPointTest {

    private final NearestValidPoint solution = new NearestValidPoint();

    @Test
    void t1() {
        int[][] points = {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
        Assertions.assertEquals(2, solution.nearestValidPoint(3, 4, points));
    }

    @Test
    void t2() {
        int[][] points = {{3, 4}};
        Assertions.assertEquals(0, solution.nearestValidPoint(3, 4, points));
    }

    @Test
    void t3() {
        int[][] points = {{2, 3}};
        Assertions.assertEquals(-1, solution.nearestValidPoint(3, 4, points));
    }
}
