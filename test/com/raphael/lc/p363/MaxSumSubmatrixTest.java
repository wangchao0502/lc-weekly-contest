package com.raphael.lc.p363;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-22 11:10:41
 */
class MaxSumSubmatrixTest {

    private final MaxSumSubmatrix solution = new MaxSumSubmatrix();

    @Test
    void t1() {
        int[][] matrix = {{1, 0, 1}, {0, -2, 3}};
        Assertions.assertEquals(2, solution.maxSumSubmatrix(matrix, 2));
    }
}
