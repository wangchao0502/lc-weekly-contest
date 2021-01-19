package com.raphael.lc.p1584;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-19 20:20:42
 */
class MinCostConnectPointsTest {

    private final MinCostConnectPoints solution = new MinCostConnectPoints();

    @Test
    void t1() {
        int[][] points = {{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
        Assertions.assertEquals(20, solution.minCostConnectPoints(points));
    }
}
