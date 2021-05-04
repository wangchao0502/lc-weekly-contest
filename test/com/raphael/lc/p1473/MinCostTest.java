package com.raphael.lc.p1473;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-04 10:24:50
 */
class MinCostTest {

    private final MinCost solution = new MinCost();

    @Test
    void t1() {
        int[] houses = {0, 0, 0, 0, 0};
        int[][] cost = {{1, 10}, {10, 1}, {10, 1}, {1, 10}, {5, 1}};
        Assertions.assertEquals(9, solution.minCost(houses, cost, 5, 2, 3));
    }
}
