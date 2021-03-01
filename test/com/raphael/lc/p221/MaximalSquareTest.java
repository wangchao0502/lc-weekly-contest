package com.raphael.lc.p221;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-01 19:48:20
 */
class MaximalSquareTest {

    private final MaximalSquare solution = new MaximalSquare();

    @Test
    void t1() {
        char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        Assertions.assertEquals(4, solution.maximalSquare(matrix));
    }
}
