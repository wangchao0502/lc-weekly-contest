package com.raphael.lc.weekly235.p5724;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-04 10:46:06
 */
class MinAbsoluteSumDiffTest {

    private final MinAbsoluteSumDiff solution = new MinAbsoluteSumDiff();

    @Test
    void t1() {
        int[] nums1 = {1, 7, 5};
        int[] nums2 = {2, 3, 5};
        Assertions.assertEquals(3, solution.minAbsoluteSumDiff(nums1, nums2));
    }

    @Test
    void t2() {
        int[] nums1 = {2, 4, 6, 8, 10};
        int[] nums2 = {2, 4, 6, 8, 10};
        Assertions.assertEquals(0, solution.minAbsoluteSumDiff(nums1, nums2));
    }

    @Test
    void t3() {
        int[] nums1 = {1, 10, 4, 4, 2, 7};
        int[] nums2 = {9, 3, 5, 1, 7, 4};
        Assertions.assertEquals(20, solution.minAbsoluteSumDiff(nums1, nums2));
    }
}
