package com.raphael.lc.p329;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-05 12:48:33
 */
class LongestIncreasingPathTest {

    private final LongestIncreasingPath solution = new LongestIncreasingPath();

    @Test
    void t1() {
        int[][] matrix = {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
        Assertions.assertEquals(4, solution.longestIncreasingPath(matrix));
    }

    @Test
    void t2() {
        int[][] matrix = {{3, 4, 5}, {3, 2, 6}, {2, 2, 1}};
        Assertions.assertEquals(4, solution.longestIncreasingPath(matrix));
    }

    @Test
    void t3() {
        int[][] matrix = {{1}};
        Assertions.assertEquals(1, solution.longestIncreasingPath(matrix));
    }
}
