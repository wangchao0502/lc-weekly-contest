package com.raphael.lc.weekly233.p5709;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-21 10:30:26
 */
class MaxAscendingSumTest {

    private final MaxAscendingSum solution = new MaxAscendingSum();

    @Test
    void t1() {
        int[] nums = {10, 20, 30, 5, 10, 50};
        Assertions.assertEquals(65, solution.maxAscendingSum(nums));
    }

    @Test
    void t2() {
        int[] nums = {10, 20, 30, 40, 50};
        Assertions.assertEquals(150, solution.maxAscendingSum(nums));
    }

    @Test
    void t3() {
        int[] nums = {100, 10, 1};
        Assertions.assertEquals(100, solution.maxAscendingSum(nums));
    }

    @Test
    void t4() {
        int[] nums = {12, 17, 15, 13, 10, 11, 12};
        Assertions.assertEquals(33, solution.maxAscendingSum(nums));
    }
}
