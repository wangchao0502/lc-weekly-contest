package com.raphael.lc.p128;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-02 11:39:25
 */
class LongestConsecutiveTest {

    private final LongestConsecutive solution = new LongestConsecutive();

    @Test
    void t1() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        Assertions.assertEquals(4, solution.longestConsecutive(nums));
    }

    @Test
    void t2() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        Assertions.assertEquals(9, solution.longestConsecutive(nums));
    }
}
