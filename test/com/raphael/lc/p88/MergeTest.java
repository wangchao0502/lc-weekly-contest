package com.raphael.lc.p88;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-11 23:46:34
 */
class MergeTest {

    private final Merge solution = new Merge();

    @Test
    void t1() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void t2() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        solution.merge(nums1, 1, nums2, 0);
        Assertions.assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void t3() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        solution.merge(nums1, 0, nums2, 1);
        Assertions.assertArrayEquals(new int[]{1}, nums1);
    }
}
