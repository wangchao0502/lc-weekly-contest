package com.raphael.lc.weekly240.p5751;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-09 10:53:31
 */
class MaxDistanceTest {

    private final MaxDistance solution = new MaxDistance();

    @Test
    void t1() {
        int[] nums1 = {55, 30, 5, 4, 2};
        int[] nums2 = {100, 20, 10, 10, 5};
        Assertions.assertEquals(2, solution.maxDistance(nums1, nums2));
    }

    @Test
    void t2() {
        int[] nums1 = {2, 2, 2};
        int[] nums2 = {10, 10, 1};
        Assertions.assertEquals(1, solution.maxDistance(nums1, nums2));
    }

    @Test
    void t3() {
        int[] nums1 = {30, 29, 19, 5};
        int[] nums2 = {25, 25, 25, 25, 25};
        Assertions.assertEquals(2, solution.maxDistance(nums1, nums2));
    }

    @Test
    void t4() {
        int[] nums1 = {5, 4};
        int[] nums2 = {3, 2};
        Assertions.assertEquals(0, solution.maxDistance(nums1, nums2));
    }
}
