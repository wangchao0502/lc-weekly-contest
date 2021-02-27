package com.raphael.lc.p867;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-25 15:20:32
 */
class TransposeTest {

    private final Transpose solution = new Transpose();

    @Test
    void t1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        Assertions.assertArrayEquals(result, solution.transpose(matrix));
    }
}
