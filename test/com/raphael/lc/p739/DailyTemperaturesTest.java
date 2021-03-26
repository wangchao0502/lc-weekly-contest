package com.raphael.lc.p739;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-26 11:10:15
 */
class DailyTemperaturesTest {

    private final DailyTemperatures solution = new DailyTemperatures();

    @Test
    void t1() {
        int[] t = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = {1, 1, 4, 2, 1, 1, 0, 0};
        Assertions.assertArrayEquals(result, solution.dailyTemperatures(t));
    }
}
