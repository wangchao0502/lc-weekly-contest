package com.raphael.lc.p220;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-17 10:02:31
 */
class ContainsNearbyAlmostDuplicateTest {

    private final ContainsNearbyAlmostDuplicate solution = new ContainsNearbyAlmostDuplicate();

    @Test
    void t1() {
        int[] nums = {1, 2, 3, 1};
        Assertions.assertTrue(solution.containsNearbyAlmostDuplicate(nums, 3, 0));
    }

    @Test
    void t2() {
        int[] nums = {1, 0, 1, 1};
        Assertions.assertTrue(solution.containsNearbyAlmostDuplicate(nums, 1, 2));
    }

    @Test
    void t3() {
        int[] nums = {1, 5, 9, 1, 5, 9};
        Assertions.assertFalse(solution.containsNearbyAlmostDuplicate(nums, 2, 3));
    }

    @Test
    void t4() {
        int[] nums = {-2147483648, 2147483647};
        Assertions.assertFalse(solution.containsNearbyAlmostDuplicate(nums, 1, 1));
    }
}
