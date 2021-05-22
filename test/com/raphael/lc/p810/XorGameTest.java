package com.raphael.lc.p810;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-22 10:39:49
 */
class XorGameTest {

    private final XorGame solution = new XorGame();

    @Test
    void t1() {
        int[] nums = {1, 1, 2};
        Assertions.assertFalse(solution.xorGame(nums));
    }
}
