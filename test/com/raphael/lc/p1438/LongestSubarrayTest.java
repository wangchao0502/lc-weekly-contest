package com.raphael.lc.p1438;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-21 12:51:23
 */
class LongestSubarrayTest {

    private final LongestSubarray solution = new LongestSubarray();

    @Test
    void t1() {
        int[] nums = {8, 2, 4, 7};
        Assertions.assertEquals(2, solution.longestSubarray(nums, 4));
    }

    @Test
    void t2() {
        int[] nums = {10, 1, 2, 4, 7, 2};
        Assertions.assertEquals(4, solution.longestSubarray(nums, 5));
    }

    @Test
    void t3() {
        int[] nums = {4, 2, 2, 2, 4, 4, 2, 2};
        Assertions.assertEquals(3, solution.longestSubarray(nums, 0));
    }
}
