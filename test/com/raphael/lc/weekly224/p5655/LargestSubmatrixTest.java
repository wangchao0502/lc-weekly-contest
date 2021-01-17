package com.raphael.lc.weekly224.p5655;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-17 10:55:59
 */
class LargestSubmatrixTest {

    private final LargestSubmatrix solution = new LargestSubmatrix();

    @Test
    void t1() {
        int[][] matrix = {
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {1, 1, 0, 0, 0},
                {1, 0, 0, 1, 0}
        };
        Assertions.assertEquals(5, solution.largestSubmatrix(matrix));
    }
}
