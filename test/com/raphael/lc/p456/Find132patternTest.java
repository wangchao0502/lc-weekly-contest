package com.raphael.lc.p456;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-24 10:02:23
 */
class Find132patternTest {

    private final Find132pattern solution = new Find132pattern();

    @Test
    void t1() {
        int[] nums = {1, 2, 3, 4};
        Assertions.assertFalse(solution.find132pattern(nums));
    }

    @Test
    void t2() {
        int[] nums = {3, 1, 4, 2};
        Assertions.assertTrue(solution.find132pattern(nums));
    }

    @Test
    void t3() {
        int[] nums = {-1, 3, 2, 0};
        Assertions.assertTrue(solution.find132pattern(nums));
    }
}
