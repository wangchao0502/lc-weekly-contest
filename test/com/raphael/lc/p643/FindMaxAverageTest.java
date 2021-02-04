package com.raphael.lc.p643;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-04 13:47:58
 */
class FindMaxAverageTest {

    private final FindMaxAverage solution = new FindMaxAverage();

    @Test
    void t1() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        Assertions.assertEquals(12.75, solution.findMaxAverage(nums, 4));
    }
}
