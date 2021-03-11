package com.raphael.lc.offer11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-11 10:46:21
 */
class MinArrayTest {

    private final MinArray solution = new MinArray();

    @Test
    void t1() {
        int[] nums = {3, 4, 5, 1, 2};
        Assertions.assertEquals(1, solution.minArray(nums));
    }

    @Test
    void t2() {
        int[] nums = {2, 2, 2, 0, 1};
        Assertions.assertEquals(0, solution.minArray(nums));
    }

    @Test
    void t3() {
        int[] nums = {3, 1, 1};
        Assertions.assertEquals(1, solution.minArray(nums));
    }
}
