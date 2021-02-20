package com.raphael.lc.p275;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-20 10:29:56
 */
class HIndexTest {

    private final HIndex solution = new HIndex();

    @Test
    void t1() {
        int[] nums = {0, 1, 3, 5, 6};
        Assertions.assertEquals(3, solution.hIndex(nums));
    }

    @Test
    void t2() {
        int[] nums = {0, 6};
        Assertions.assertEquals(1, solution.hIndex(nums));
    }

    @Test
    void t3() {
        int[] nums = {0};
        Assertions.assertEquals(0, solution.hIndex(nums));
    }

    @Test
    void t4() {
        int[] nums = {};
        Assertions.assertEquals(0, solution.hIndex(nums));
    }
}
