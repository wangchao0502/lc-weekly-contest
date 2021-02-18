package com.raphael.lc.p995;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-18 09:57:35
 */
class MinKBitFlipsTest {

    private final MinKBitFlips solution = new MinKBitFlips();

    @Test
    void t1() {
        int[] nums = {0, 0, 0, 1, 0, 1, 1, 0};
        Assertions.assertEquals(3, solution.minKBitFlips(nums, 3));
    }

    @Test
    void t2() {
        int[] nums = {1, 1, 0};
        Assertions.assertEquals(-1, solution.minKBitFlips(nums, 2));
    }
}
