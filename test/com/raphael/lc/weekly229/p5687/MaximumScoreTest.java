package com.raphael.lc.weekly229.p5687;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-21 10:56:55
 */
class MaximumScoreTest {

    private final MaximumScore solution = new MaximumScore();

    @Test
    void t1() {
        int[] nums = {1, 2, 3};
        int[] multipliers = {3, 2, 1};
        Assertions.assertEquals(14, solution.maximumScore(nums, multipliers));
    }

    @Test
    void t2() {
        int[] nums = {-5, -3, -3, -2, 7, 1};
        int[] multipliers = {-10, -5, 3, 4, 6};
        Assertions.assertEquals(102, solution.maximumScore(nums, multipliers));
    }
}
