package com.raphael.lc.p697;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-20 09:57:14
 */
class FindShortestSubArrayTest {

    private final FindShortestSubArray solution = new FindShortestSubArray();

    @Test
    void t1() {
        int[] nums = {1, 2, 2, 3, 1};
        Assertions.assertEquals(2, solution.findShortestSubArray(nums));
    }

    @Test
    void t2() {
        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        Assertions.assertEquals(6, solution.findShortestSubArray(nums));
    }
}
