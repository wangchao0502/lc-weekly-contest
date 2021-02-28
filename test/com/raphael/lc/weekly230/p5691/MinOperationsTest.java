package com.raphael.lc.weekly230.p5691;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-28 12:03:22
 */
class MinOperationsTest {

    private final MinOperations solution = new MinOperations();

    @Test
    void t1() {
        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {1, 1, 2, 2, 2, 2};
        Assertions.assertEquals(3, solution.minOperations(nums1, nums2));
    }
}
