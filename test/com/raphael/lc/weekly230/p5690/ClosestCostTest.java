package com.raphael.lc.weekly230.p5690;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-28 10:35:08
 */
class ClosestCostTest {

    private final ClosestCost solution = new ClosestCost();

    @Test
    void t1() {
        int[] baseCosts = {1, 7};
        int[] toppingCosts = {3, 4};
        Assertions.assertEquals(10, solution.closestCost(baseCosts, toppingCosts, 10));
    }

    @Test
    void t2() {
        int[] baseCosts = {2, 3};
        int[] toppingCosts = {4, 5, 100};
        Assertions.assertEquals(17, solution.closestCost(baseCosts, toppingCosts, 18));
    }

    @Test
    void t3() {
        int[] baseCosts = {3, 10};
        int[] toppingCosts = {2, 5};
        Assertions.assertEquals(8, solution.closestCost(baseCosts, toppingCosts, 9));
    }

    @Test
    void t4() {
        int[] baseCosts = {10};
        int[] toppingCosts = {1};
        Assertions.assertEquals(10, solution.closestCost(baseCosts, toppingCosts, 1));
    }
}
