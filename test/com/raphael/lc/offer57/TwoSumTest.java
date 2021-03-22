package com.raphael.lc.offer57;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-22 12:09:06
 */
class TwoSumTest {

    private final TwoSum solution = new TwoSum();

    @Test
    void t1() {
        int[] nums = {2, 7, 11, 15};
        int[] result = {2, 7};
        Assertions.assertArrayEquals(result, solution.twoSum(nums, 9));
    }

    @Test
    void t2() {
        int[] nums = {10, 26, 30, 31, 47, 60};
        int[] result = {10, 30};
        Assertions.assertArrayEquals(result, solution.twoSum(nums, 40));
    }
}
