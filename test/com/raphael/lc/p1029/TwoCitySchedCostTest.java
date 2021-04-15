package com.raphael.lc.p1029;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-15 11:17:19
 */
class TwoCitySchedCostTest {

    private final TwoCitySchedCost solution = new TwoCitySchedCost();

    @Test
    void t1() {
        int[][] costs = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        Assertions.assertEquals(110, solution.twoCitySchedCost(costs));
    }
}
