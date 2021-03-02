package com.raphael.lc.p309;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-02 07:58:36
 */
class MaxProfitTest {

    private final MaxProfit solution = new MaxProfit();

    @Test
    void t1() {
        int[] prices = {1, 2, 3, 0, 2};
        Assertions.assertEquals(3, solution.maxProfit(prices));
    }
}
