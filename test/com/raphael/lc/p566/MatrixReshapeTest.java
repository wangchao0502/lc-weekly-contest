package com.raphael.lc.p566;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-17 12:17:40
 */
class MatrixReshapeTest {

    private final MatrixReshape solution = new MatrixReshape();

    @Test
    void t1() {
        int[][] nums = {{1, 2}, {3, 4}};
        int[][] result = {{1, 2, 3, 4}};
        Assertions.assertArrayEquals(result, solution.matrixReshape(nums, 1, 4));
    }

    @Test
    void t2() {
        int[][] nums = {{1, 2}, {3, 4}};
        int[][] result = {{1, 2}, {3, 4}};
        Assertions.assertArrayEquals(result, solution.matrixReshape(nums, 2, 4));
    }

    @Test
    void t3() {
        int[][] nums = {{1, 2}, {3, 4}};
        int[][] result = {{1}, {2}, {3}, {4}};
        Assertions.assertArrayEquals(result, solution.matrixReshape(nums, 4, 1));
    }

    @Test
    void t4() {
        int[][] nums = {{1, 2, 3, 4}};
        int[][] result = {{1, 2}, {3, 4}};
        Assertions.assertArrayEquals(result, solution.matrixReshape(nums, 2, 2));
    }
}
