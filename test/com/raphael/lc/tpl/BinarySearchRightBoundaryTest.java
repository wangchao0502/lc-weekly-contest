package com.raphael.lc.tpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-01 00:41:13
 */
class BinarySearchRightBoundaryTest {

    private final BinarySearchRightBoundary solution = new BinarySearchRightBoundary();

    @Test
    void t1() {
        int[] nums = {1, 3, 5, 5, 8, 10};
        Assertions.assertEquals(3, solution.binarySearchRightBoundary(nums, 5));
    }

    @Test
    void t2() {
        int[] nums = {1, 3, 5, 8, 10};
        Assertions.assertEquals(-1, solution.binarySearchRightBoundary(nums, 4));
    }
}
