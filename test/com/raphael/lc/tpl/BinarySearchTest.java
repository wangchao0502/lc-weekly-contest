package com.raphael.lc.tpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-01 00:02:14
 */
class BinarySearchTest {

    private final BinarySearch solution = new BinarySearch();

    @Test
    void t1() {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        Assertions.assertEquals(3, solution.binarySearch(nums, 3));
    }

    @Test
    void t2() {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        Assertions.assertEquals(-1, solution.binarySearch(nums, 9));
    }
}
