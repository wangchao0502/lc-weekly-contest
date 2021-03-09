package com.raphael.lc.offer04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-08 21:36:20
 */
class FindNumberIn2DArrayTest {

    private final FindNumberIn2DArray solution = new FindNumberIn2DArray();

    @Test
    void t1() {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30},
        };
        Assertions.assertTrue(solution.findNumberIn2DArray(matrix, 5));
        Assertions.assertFalse(solution.findNumberIn2DArray(matrix, 20));
    }
}
