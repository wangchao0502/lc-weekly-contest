package com.raphael.lc.p167;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-16 17:52:49
 */
class TwoSumTest {

    private final TwoSum solution = new TwoSum();

    @Test
    void t1() {
        int[] nums = {2, 7, 11, 15};
        Assertions.assertArrayEquals(new int[]{1, 2}, solution.twoSum(nums, 9));
    }
}
