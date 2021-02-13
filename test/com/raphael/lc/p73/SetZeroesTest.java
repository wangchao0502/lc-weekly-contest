package com.raphael.lc.p73;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-13 13:57:32
 */
class SetZeroesTest {

    private final SetZeroes solution = new SetZeroes();

    @Test
    void t1() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        solution.setZeroes(matrix);
        int[][] result = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        Assertions.assertArrayEquals(result, matrix);
    }
}
