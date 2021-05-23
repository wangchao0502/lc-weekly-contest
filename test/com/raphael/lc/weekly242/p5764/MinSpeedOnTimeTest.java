package com.raphael.lc.weekly242.p5764;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-23 10:41:17
 */
class MinSpeedOnTimeTest {

    private final MinSpeedOnTime solution = new MinSpeedOnTime();

    @Test
    void t1() {
        int[] dist = {1, 3, 2};
        Assertions.assertEquals(1, solution.minSpeedOnTime(dist, 6));
    }

    @Test
    void t2() {
        int[] dist = {1, 3, 2};
        Assertions.assertEquals(3, solution.minSpeedOnTime(dist, 2.7));
    }

    @Test
    void t3() {
        int[] dist = {1, 3, 2};
        Assertions.assertEquals(-1, solution.minSpeedOnTime(dist, 1.9));
    }

    @Test
    void t4() {
        int[] dist = {1, 1, 100000};
        Assertions.assertEquals(10000000, solution.minSpeedOnTime(dist, 2.01));
    }

    @Test
    void t5() {
        int[] dist = {5, 3, 4, 6, 2, 2, 7};
        Assertions.assertEquals(4, solution.minSpeedOnTime(dist, 10.92));
    }

    @Test
    void t6() {
        int[] dist = {92, 41, 28, 84, 64, 51, 83, 59, 19, 34, 18, 32, 96, 72, 69, 34, 96, 75, 55, 75, 52, 47, 29, 18, 66, 64, 12, 97, 7, 15, 20, 81, 21, 88, 55, 77, 9, 50, 49, 77, 60, 68, 33, 71, 2, 88, 93, 15, 88, 69, 97, 35, 99, 83, 44, 15, 38, 56, 21, 59, 1, 93, 93, 34, 65, 98, 23, 65, 14, 81, 39, 82, 65, 78, 26, 20, 48, 98, 21, 70, 100, 68, 1, 77, 42, 63};
        Assertions.assertEquals(78, solution.minSpeedOnTime(dist, 107.52));
    }
}
