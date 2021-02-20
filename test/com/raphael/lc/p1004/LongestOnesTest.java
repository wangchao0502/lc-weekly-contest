package com.raphael.lc.p1004;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-19 16:21:47
 */
class LongestOnesTest {

    private final LongestOnes solution = new LongestOnes();

    @Test
    void t1() {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        Assertions.assertEquals(6, solution.longestOnes(nums, 2));
    }

    @Test
    void t2() {
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        Assertions.assertEquals(10, solution.longestOnes(nums, 3));
    }

    @Test
    void t3() {
        int[] nums = {0, 0, 1, 1, 1, 0, 0};
        Assertions.assertEquals(3, solution.longestOnes(nums, 0));
    }

    @Test
    void t4() {
        int[] nums = {0, 0, 0, 0};
        Assertions.assertEquals(0, solution.longestOnes(nums, 0));
    }

    @Test
    void t5() {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        Assertions.assertEquals(4, solution.longestOnes(nums, 0));
    }

    @Test
    void t6() {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        Assertions.assertEquals(6, solution.longestOnes(nums, 2));
    }

    @Test
    void t7() {
        int[] nums = {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1};
        Assertions.assertEquals(25, solution.longestOnes(nums, 8));
    }
}
