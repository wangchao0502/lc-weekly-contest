package com.raphael.lc.p896;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-28 09:59:15
 */
class IsMonotonicTest {

    private final IsMonotonic solution = new IsMonotonic();

    @Test
    void t1() {
        int[] nums = {1, 2, 2, 3};
        Assertions.assertTrue(solution.isMonotonic(nums));
    }

    @Test
    void t2() {
        int[] nums = {6, 5, 4, 4};
        Assertions.assertTrue(solution.isMonotonic(nums));
    }

    @Test
    void t3() {
        int[] nums = {1, 3, 2};
        Assertions.assertFalse(solution.isMonotonic(nums));
    }

    @Test
    void t4() {
        int[] nums = {1, 2, 4, 5};
        Assertions.assertTrue(solution.isMonotonic(nums));
    }

    @Test
    void t5() {
        int[] nums = {1, 1, 1};
        Assertions.assertTrue(solution.isMonotonic(nums));
    }

    @Test
    void t6() {
        int[] nums = {11, 11, 9, 4, 3, 3, 3, 1, -1, -1, 3, 3, 3, 5, 5, 5};
        Assertions.assertFalse(solution.isMonotonic(nums));
    }
}
