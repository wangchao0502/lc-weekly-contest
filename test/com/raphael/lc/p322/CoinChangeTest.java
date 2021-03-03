package com.raphael.lc.p322;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-03 11:13:36
 */
class CoinChangeTest {

    private final CoinChange solution = new CoinChange();

    @Test
    void t1() {
        int[] coins = {1, 2, 5};
        Assertions.assertEquals(3, solution.coinChange(coins, 11));
    }

    @Test
    void t2() {
        int[] coins = {2};
        Assertions.assertEquals(-1, solution.coinChange(coins, 3));
    }
}
