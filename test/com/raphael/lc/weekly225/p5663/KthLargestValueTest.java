package com.raphael.lc.weekly225.p5663;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-24 11:28:27
 */
class KthLargestValueTest {

    private final KthLargestValue solution = new KthLargestValue();

    @Test
    void t1() {
        int[][] matrix = {{5, 2}, {1, 6}};
        Assertions.assertEquals(0, solution.kthLargestValue(matrix, 4));
    }

    @Test
    void t2() {
        int[][] matrix = {{5, 2}, {1, 6}};
        Assertions.assertEquals(4, solution.kthLargestValue(matrix, 3));
    }

    @Test
    void t3() {
        int[][] matrix = {{5, 2}, {1, 6}};
        Assertions.assertEquals(5, solution.kthLargestValue(matrix, 2));
    }

    @Test
    void t4() {
        int[][] matrix = {{10, 9, 5}, {2, 0, 4}, {1, 0, 9}, {3, 4, 8}};
        Assertions.assertEquals(10, solution.kthLargestValue(matrix, 10));
    }
}
