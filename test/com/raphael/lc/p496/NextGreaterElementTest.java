package com.raphael.lc.p496;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-24 10:51:59
 */
class NextGreaterElementTest {

    private final NextGreaterElement solution = new NextGreaterElement();

    @Test
    void t1() {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = {-1, 3, -1};
        Assertions.assertArrayEquals(result, solution.nextGreaterElement(nums1, nums2));
    }

    @Test
    void t2() {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] result = {3, -1};
        Assertions.assertArrayEquals(result, solution.nextGreaterElement(nums1, nums2));
    }

    @Test
    void t3() {
        int[] nums1 = {1, 3, 5, 2, 4};
        int[] nums2 = {6, 5, 4, 3, 2, 1, 7};
        int[] result = {7, 7, 7, 7, 7};
        Assertions.assertArrayEquals(result, solution.nextGreaterElement(nums1, nums2));
    }
}
