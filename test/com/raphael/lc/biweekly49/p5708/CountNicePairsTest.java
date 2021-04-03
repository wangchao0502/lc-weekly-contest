package com.raphael.lc.biweekly49.p5708;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-03 23:16:57
 */
class CountNicePairsTest {

    private final CountNicePairs solution = new CountNicePairs();

    @Test
    void t1() {
        int[] nums = {42, 11, 1, 97};
        Assertions.assertEquals(2, solution.countNicePairs(nums));
    }

    @Test
    void t2() {
        int[] nums = {13, 10, 35, 24, 76};
        Assertions.assertEquals(4, solution.countNicePairs(nums));
    }
}
