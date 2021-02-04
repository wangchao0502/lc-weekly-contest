package com.raphael.lc.p80;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-04 16:46:10
 */
class RemoveDuplicatesTest {

    private final RemoveDuplicates solution = new RemoveDuplicates();

    @Test
    void t1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        Assertions.assertEquals(5, solution.removeDuplicates(nums));
    }

    @Test
    void t2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        Assertions.assertEquals(7, solution.removeDuplicates(nums));
    }
}
