package com.raphael.lc.offer42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-18 11:16:10
 */
class MaxSubArrayTest {

    private final MaxSubArray solution = new MaxSubArray();

    @Test
    void t1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assertions.assertEquals(6, solution.maxSubArray(nums));
    }
}
