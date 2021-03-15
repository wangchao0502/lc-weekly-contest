package com.raphael.lc.offer21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-15 15:55:42
 */
class ExchangeTest {

    private final Exchange solution = new Exchange();

    @Test
    void t1() {
        int[] nums = {1, 2, 3, 4};
        int[] ans = {1, 3, 2, 4};
        Assertions.assertArrayEquals(ans, solution.exchange(nums));
    }
}
