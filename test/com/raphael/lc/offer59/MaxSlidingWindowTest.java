package com.raphael.lc.offer59;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-22 12:30:56
 */
class MaxSlidingWindowTest {

    private final MaxSlidingWindow solution = new MaxSlidingWindow();

    @Test
    void t1() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] result = {3, 3, 5, 5, 6, 7};
        Assertions.assertArrayEquals(result, solution.maxSlidingWindow(nums, 3));
    }
}
