package com.raphael.lc.p174;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-30 17:52:48
 */
class CalculateMinimumHPTest {

    private final CalculateMinimumHP solution = new CalculateMinimumHP();

    @Test
    void t1() {
        int[][] dungeon = {{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        Assertions.assertEquals(7, solution.calculateMinimumHP(dungeon));
    }
}
