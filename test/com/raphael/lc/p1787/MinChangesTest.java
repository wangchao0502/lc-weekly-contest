package com.raphael.lc.p1787;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-25 11:53:52
 */
class MinChangesTest {

    private final MinChanges solution = new MinChanges();

    @Test
    void t1() {
        int[] nums = {1, 2, 0, 3, 0};
        Assertions.assertEquals(3, solution.minChanges(nums, 1));
    }

    @Test
    void t2() {
        int[] nums = {3, 4, 5, 2, 1, 7, 3, 4, 7};
        Assertions.assertEquals(3, solution.minChanges(nums, 3));
    }
}
