package com.raphael.lc.weekly232.p5704;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-14 11:32:25
 */
class MaximumScoreTest {

    private final MaximumScore solution = new MaximumScore();

    @Test
    void t1() {
        int[] nums = {1, 4, 3, 7, 4, 5};
        Assertions.assertEquals(15, solution.maximumScore(nums, 3));
    }

    @Test
    void t2() {
        int[] nums = {5, 5, 4, 5, 4, 1, 1, 1};
        Assertions.assertEquals(20, solution.maximumScore(nums, 0));
    }
}
