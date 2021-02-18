package com.raphael.lc.p74;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-18 11:16:44
 */
class SearchMatrixTest {

    private final SearchMatrix solution = new SearchMatrix();

    @Test
    void t1() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        Assertions.assertTrue(solution.searchMatrix(matrix, 3));
    }

    @Test
    void t2() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        Assertions.assertFalse(solution.searchMatrix(matrix, 13));
    }

    @Test
    void t3() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        Assertions.assertFalse(solution.searchMatrix(matrix, 100));
    }

    @Test
    void t4() {
        int[][] matrix = {{10, 11, 16, 20}, {23, 30, 34, 60}};
        Assertions.assertFalse(solution.searchMatrix(matrix, 1));
    }

    @Test
    void t5() {
        int[][] matrix = {{10, 11, 16, 20}, {23, 30, 34, 60}};
        Assertions.assertFalse(solution.searchMatrix(matrix, 12));
    }

    @Test
    void t6() {
        int[][] matrix = {{10, 11, 16, 20}, {23, 30, 34, 60}};
        Assertions.assertTrue(solution.searchMatrix(matrix, 10));
    }

    @Test
    void t7() {
        int[][] matrix = {{1}};
        Assertions.assertTrue(solution.searchMatrix(matrix, 1));
    }

    @Test
    void t8() {
        int[][] matrix = {{1, 3}};
        Assertions.assertTrue(solution.searchMatrix(matrix, 3));
    }
}
