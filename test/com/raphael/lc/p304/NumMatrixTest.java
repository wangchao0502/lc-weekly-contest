package com.raphael.lc.p304;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-02 07:39:59
 */
class NumMatrixTest {

    @Test
    void t1() {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        NumMatrix nm = new NumMatrix(matrix);
        Assertions.assertEquals(8, nm.sumRegion(2, 1, 4, 3));
        Assertions.assertEquals(11, nm.sumRegion(1, 1, 2, 2));
        Assertions.assertEquals(12, nm.sumRegion(1, 2, 2, 4));
    }
}
