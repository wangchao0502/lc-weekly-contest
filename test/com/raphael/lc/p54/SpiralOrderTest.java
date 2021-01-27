package com.raphael.lc.p54;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-27 21:31:06
 */
class SpiralOrderTest {

    private final SpiralOrder solution = new SpiralOrder();

    @Test
    void t1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        Assertions.assertEquals(result, solution.spiralOrder(matrix));
    }
}
