package com.raphael.lc.weekly237.p5735;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-18 10:36:08
 */
class MaxIceCreamTest {

    private final MaxIceCream solution = new MaxIceCream();

    @Test
    void t1() {
        int[] costs = {1, 3, 2, 4, 1};
        Assertions.assertEquals(4, solution.maxIceCream(costs, 7));
    }

    @Test
    void t2() {
        int[] costs = {10, 6, 8, 7, 7, 8};
        Assertions.assertEquals(0, solution.maxIceCream(costs, 5));
    }

    @Test
    void t3() {
        int[] costs = {1, 6, 3, 1, 2, 5};
        Assertions.assertEquals(6, solution.maxIceCream(costs, 20));
    }
}
