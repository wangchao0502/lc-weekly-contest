package com.raphael.lc.p766;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-22 16:14:16
 */
class IsToeplitzMatrixTest {

    private final IsToeplitzMatrix solution = new IsToeplitzMatrix();

    @Test
    void t1() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };
        Assertions.assertTrue(solution.isToeplitzMatrix(matrix));
    }

    @Test
    void t2() {
        int[][] matrix = {
                {1, 2},
                {2, 2}
        };
        Assertions.assertFalse(solution.isToeplitzMatrix(matrix));
    }
}
