package com.raphael.lc.p485;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-15 14:26:12
 */
class FindMaxConsecutiveOnesTest {

    private final FindMaxConsecutiveOnes solution = new FindMaxConsecutiveOnes();

    @Test
    void t1() {
        int[] nums = {1, 1, 0, 1, 1, 1};
        Assertions.assertEquals(3, solution.findMaxConsecutiveOnes(nums));
    }

    @Test
    void t2() {
        int[] nums = {0, 1, 0, 1, 1, 1};
        Assertions.assertEquals(3, solution.findMaxConsecutiveOnes(nums));
    }
}
