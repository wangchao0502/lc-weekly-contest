package com.raphael.lc.tpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-01 00:13:24
 */
class BinarySearchLeftBoundaryTest {

    private final BinarySearchLeftBoundary solution = new BinarySearchLeftBoundary();

    @Test
    void t1() {
        int[] nums = {1, 3, 5, 5, 8, 10};
        Assertions.assertEquals(2, solution.binarySearchLeftBoundary(nums, 5));
    }

    @Test
    void t2() {
        int[] nums = {1, 3, 5, 8, 10};
        Assertions.assertEquals(-1, solution.binarySearchLeftBoundary(nums, 4));
    }
}
