package com.raphael.lc.p26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-18 10:05:45
 */
class RemoveDuplicatesTest {

    private final RemoveDuplicates solution = new RemoveDuplicates();

    @Test
    void t1() {
        int[] nums = {1, 1, 2};
        Assertions.assertEquals(2, solution.removeDuplicates(nums));
    }

    @Test
    void t2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Assertions.assertEquals(5, solution.removeDuplicates(nums));
    }
}
