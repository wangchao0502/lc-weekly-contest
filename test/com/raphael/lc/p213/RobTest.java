package com.raphael.lc.p213;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-27 19:28:20
 */
class RobTest {

    private final Rob solution = new Rob();

    @Test
    void t1() {
        int[] nums = {2, 3, 2};
        Assertions.assertEquals(3, solution.rob(nums));
    }

    @Test
    void t2() {
        int[] nums = {1, 2, 3, 1};
        Assertions.assertEquals(4, solution.rob(nums));
    }

    @Test
    void t3() {
        int[] nums = {0};
        Assertions.assertEquals(0, solution.rob(nums));
    }
}
