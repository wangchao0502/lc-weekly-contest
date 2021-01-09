package com.raphael.lc.p123;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-09 16:11:23
 */
class MaxProfitTest {

    private final MaxProfit solution = new MaxProfit();

    @Test
    void t1() {
        Assertions.assertEquals(6, solution.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
        Assertions.assertEquals(4, solution.maxProfit(new int[]{1, 2, 3, 4, 5}));
        Assertions.assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 2, 1}));
        Assertions.assertEquals(0, solution.maxProfit(new int[]{1}));
    }
}
