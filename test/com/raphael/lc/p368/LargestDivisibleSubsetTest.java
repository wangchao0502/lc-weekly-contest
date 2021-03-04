package com.raphael.lc.p368;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-03-04 11:47:05
 */
class LargestDivisibleSubsetTest {

    private final LargestDivisibleSubset solution = new LargestDivisibleSubset();

    @Test
    void t1() {
        int[] nums = {1, 2, 3};
        Assertions.assertEquals(Arrays.asList(1, 2), solution.largestDivisibleSubset(nums));
    }

    @Test
    void t2() {
        int[] nums = {1, 2, 4, 8};
        Assertions.assertEquals(Arrays.asList(1, 2, 4, 8), solution.largestDivisibleSubset(nums));
    }

    @Test
    void t3() {
        int[] nums = {4, 8, 10, 240};
        Assertions.assertEquals(Arrays.asList(4, 8, 240), solution.largestDivisibleSubset(nums));
    }
}
