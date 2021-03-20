package com.raphael.lc.biweekly48.p5712;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-20 22:53:15
 */
class GetMaximumConsecutiveTest {

    private final GetMaximumConsecutive solution = new GetMaximumConsecutive();

    @Test
    void t1() {
        int[] coins = {1, 3};
        Assertions.assertEquals(2, solution.getMaximumConsecutive(coins));
    }

    @Test
    void t2() {
        int[] coins = {1, 1, 1, 4};
        Assertions.assertEquals(8, solution.getMaximumConsecutive(coins));
    }

    @Test
    void t3() {
        int[] coins = {1, 4, 10, 3, 1};
        Assertions.assertEquals(20, solution.getMaximumConsecutive(coins));
    }
}
