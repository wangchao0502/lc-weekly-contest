package com.raphael.lc.p240;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-19 18:47:35
 */
class SearchMatrixTest {

    private final SearchMatrix solution = new SearchMatrix();

    @Test
    void t1() {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        Assertions.assertTrue(solution.searchMatrix(matrix, 5));
    }
}
