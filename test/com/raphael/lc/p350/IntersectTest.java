package com.raphael.lc.p350;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-07 22:50:20
 */
class IntersectTest {

    private final Intersect solution = new Intersect();

    @Test
    void t1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = {2, 2};
        Assertions.assertArrayEquals(result, solution.intersect(nums1, nums2));
    }
}
