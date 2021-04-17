package com.raphael.lc.biweekly50.p5717;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-17 23:06:30
 */
class MinOperationsTest {

    private final MinOperations solution = new MinOperations();

    @Test
    void t1() {
        int[] nums = {1, 1, 1};
        Assertions.assertEquals(3, solution.minOperations(nums));
    }

    @Test
    void t2() {
        int[] nums = {1, 5, 2, 4, 1};
        Assertions.assertEquals(14, solution.minOperations(nums));
    }

    @Test
    void t3() {
        int[] nums = {8};
        Assertions.assertEquals(0, solution.minOperations(nums));
    }
}
