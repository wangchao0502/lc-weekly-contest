package com.raphael.lc.offer63;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-22 14:26:04
 */
class MaxProfitTest {

    private final MaxProfit solution = new MaxProfit();

    @Test
    void t1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Assertions.assertEquals(5, solution.maxProfit(prices));
    }

    @Test
    void t2() {
        int[] prices = {7, 6, 4, 3, 1};
        Assertions.assertEquals(0, solution.maxProfit(prices));
    }
}
