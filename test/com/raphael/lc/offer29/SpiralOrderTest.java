package com.raphael.lc.offer29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-16 15:36:51
 */
class SpiralOrderTest {

    private final SpiralOrder solution = new SpiralOrder();

    @Test
    void t1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] ans = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        Assertions.assertArrayEquals(ans, solution.spiralOrder(matrix));
    }

    @Test
    void t2() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[] ans = {1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7};
        Assertions.assertArrayEquals(ans, solution.spiralOrder(matrix));
    }
}
