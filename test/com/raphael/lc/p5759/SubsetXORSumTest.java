package com.raphael.lc.p5759;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-16 10:33:00
 */
class SubsetXORSumTest {

    private final SubsetXORSum solution = new SubsetXORSum();

    @Test
    void t1() {
        int[] nums = {1, 3};
        Assertions.assertEquals(6, solution.subsetXORSum(nums));
    }

    @Test
    void t2() {
        int[] nums = {5, 1, 6};
        Assertions.assertEquals(28, solution.subsetXORSum(nums));
    }

    @Test
    void t3() {
        int[] nums = {3, 4, 5, 6, 7, 8};
        Assertions.assertEquals(480, solution.subsetXORSum(nums));
    }
}
