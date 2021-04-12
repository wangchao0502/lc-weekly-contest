package com.raphael.lc.p179;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-12 11:35:29
 */
class LargestNumberTest {

    private final LargestNumber solution = new LargestNumber();

    @Test
    void t1() {
        int[] nums = {10, 2};
        Assertions.assertEquals("210", solution.largestNumber(nums));
    }

    @Test
    void t2() {
        int[] nums = {3, 30, 34, 5, 9};
        Assertions.assertEquals("9534330", solution.largestNumber(nums));
    }

    @Test
    void t3() {
        int[] nums = {1};
        Assertions.assertEquals("1", solution.largestNumber(nums));
    }

    @Test
    void t4() {
        int[] nums = {10};
        Assertions.assertEquals("10", solution.largestNumber(nums));
    }

    @Test
    void t5() {
        int[] nums = {111311, 1113};
        Assertions.assertEquals("1113111311", solution.largestNumber(nums));
    }
}
