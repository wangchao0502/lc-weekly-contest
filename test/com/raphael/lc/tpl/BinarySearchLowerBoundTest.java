package com.raphael.lc.tpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-01 00:13:24
 */
class BinarySearchLowerBoundTest {

    private final BinarySearchLowerBound solution = new BinarySearchLowerBound();

    @Test
    void t1() {
        int[] nums = {1, 3, 5, 5, 8, 10};
        Assertions.assertEquals(2, solution.binarySearchLowerBound(nums, 5));
    }

    @Test
    void t2() {
        int[] nums = {1, 3, 5, 8, 10};
        Assertions.assertEquals(2, solution.binarySearchLowerBound(nums, 4));
    }

    @Test
    void t3() {
        int[] nums = {1, 3, 5, 8, 10};
        Assertions.assertEquals(0, solution.binarySearchLowerBound(nums, 1));
    }

    @Test
    void t4() {
        int[] nums = {1, 3, 5, 8, 10};
        Assertions.assertEquals(0, solution.binarySearchLowerBound(nums, 0));
    }

    @Test
    void t5() {
        int[] nums = {1, 3, 5, 8, 10};
        Assertions.assertEquals(4, solution.binarySearchLowerBound(nums, 10));
    }

    @Test
    void t6() {
        int[] nums = {1, 3, 5, 8, 10};
        Assertions.assertEquals(5, solution.binarySearchLowerBound(nums, 20));
    }
}
