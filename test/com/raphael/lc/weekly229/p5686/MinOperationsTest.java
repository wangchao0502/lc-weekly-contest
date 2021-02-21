package com.raphael.lc.weekly229.p5686;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-21 10:37:50
 */
class MinOperationsTest {

    private final MinOperations solution = new MinOperations();

    @Test
    void t1() {
        Assertions.assertArrayEquals(new int[]{1, 1, 3}, solution.minOperations("110"));
    }

    @Test
    void t2() {
        Assertions.assertArrayEquals(new int[]{11, 8, 5, 4, 3, 4}, solution.minOperations("001011"));
    }
}
