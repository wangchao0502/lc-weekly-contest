package com.raphael.lc.p1217;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-12 12:37:35
 */
class MinCostToMoveChipsTest {

    private final MinCostToMoveChips solution = new MinCostToMoveChips();

    @Test
    void t1() {
        int[] chips = {1, 2, 3};
        Assertions.assertEquals(1, solution.minCostToMoveChips(chips));
    }

    @Test
    void t2() {
        int[] chips = {2, 2, 2, 3, 3};
        Assertions.assertEquals(2, solution.minCostToMoveChips(chips));
    }
}
