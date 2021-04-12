package com.raphael.lc.p1005;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-12 12:12:15
 */
class LargestSumAfterKNegationsTest {

    private final LargestSumAfterKNegations solution = new LargestSumAfterKNegations();

    @Test
    void t1() {
        int[] nums = {4, 2, 3};
        Assertions.assertEquals(5, solution.largestSumAfterKNegations(nums, 1));
    }

    @Test
    void t2() {
        int[] nums = {3, -1, 0, 2};
        Assertions.assertEquals(6, solution.largestSumAfterKNegations(nums, 3));
    }

    @Test
    void t3() {
        int[] nums = {2, -3, -1, 5, -4};
        Assertions.assertEquals(13, solution.largestSumAfterKNegations(nums, 2));
    }
}
