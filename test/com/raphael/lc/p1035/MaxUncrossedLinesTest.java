package com.raphael.lc.p1035;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-21 13:00:39
 */
class MaxUncrossedLinesTest {

    private final MaxUncrossedLines solution = new MaxUncrossedLines();

    @Test
    void t1() {
        int[] nums1 = {1, 4, 2};
        int[] nums2 = {1, 2, 4};
        Assertions.assertEquals(2, solution.maxUncrossedLines(nums1, nums2));
    }

    @Test
    void t2() {
        int[] nums1 = {2, 5, 1, 2, 5};
        int[] nums2 = {10, 5, 2, 1, 5, 2};
        Assertions.assertEquals(3, solution.maxUncrossedLines(nums1, nums2));
    }
}
