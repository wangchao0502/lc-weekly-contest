package com.raphael.lc.p1074;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-29 11:00:37
 */
class NumSubmatrixSumTargetTest {

    private final NumSubmatrixSumTarget solution = new NumSubmatrixSumTarget();

    @Test
    void t1() {
        int[][] matrix = {{0, 1, 0}, {1, 1, 1}, {0, 1, 0}};
        Assertions.assertEquals(4, solution.numSubmatrixSumTarget(matrix, 0));
    }

    @Test
    void t2() {
        int[][] matrix = {{1, -1}, {-1, 1}};
        Assertions.assertEquals(5, solution.numSubmatrixSumTarget(matrix, 0));
    }

    @Test
    void t3() {
        int[][] matrix = {{904}};
        Assertions.assertEquals(0, solution.numSubmatrixSumTarget(matrix, 0));
    }
}
