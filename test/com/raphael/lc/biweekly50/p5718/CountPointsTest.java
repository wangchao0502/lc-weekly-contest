package com.raphael.lc.biweekly50.p5718;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-17 23:11:57
 */
class CountPointsTest {

    private final CountPoints solution = new CountPoints();

    @Test
    void t1() {
        int[][] points = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};
        int[] ans = {3, 2, 2};
        Assertions.assertArrayEquals(ans, solution.countPoints(points, queries));
    }
}
