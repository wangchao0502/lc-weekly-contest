package com.raphael.lc.p1232;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-17 10:23:17
 */
class CheckStraightLineTest {

    private final CheckStraightLine solution = new CheckStraightLine();

    @Test
    void t1() {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        Assertions.assertTrue(solution.checkStraightLine(coordinates));
    }

    @Test
    void t2() {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 5}};
        Assertions.assertFalse(solution.checkStraightLine(coordinates));
    }
}
