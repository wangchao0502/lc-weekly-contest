package com.raphael.lc.p1518;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-21 13:28:27
 */
class NumWaterBottlesTest {

    private final NumWaterBottles solution = new NumWaterBottles();

    @Test
    void t1() {
        Assertions.assertEquals(13, solution.numWaterBottles(9, 3));
    }

    @Test
    void t2() {
        Assertions.assertEquals(19, solution.numWaterBottles(15, 4));
    }

    @Test
    void t3() {
        Assertions.assertEquals(6, solution.numWaterBottles(5, 5));
    }

    @Test
    void t4() {
        Assertions.assertEquals(2, solution.numWaterBottles(2, 3));
    }
}
