package com.raphael.lc.p59;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-16 13:39:43
 */
class GenerateMatrixTest {

    private final GenerateMatrix solution = new GenerateMatrix();

    @Test
    void t1() {
        int[][] result = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        Assertions.assertArrayEquals(result, solution.generateMatrix(3));
    }

    @Test
    void t2() {
        int[][] result = {{1}};
        Assertions.assertArrayEquals(result, solution.generateMatrix(1));
    }
}
