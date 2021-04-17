package com.raphael.lc.p1094;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-17 10:15:19
 */
class CarPoolingTest {

    private final CarPooling solution = new CarPooling();

    @Test
    void t1() {
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        Assertions.assertFalse(solution.carPooling(trips, 4));
    }

    @Test
    void t2() {
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        Assertions.assertTrue(solution.carPooling(trips, 5));
    }

    @Test
    void t3() {
        int[][] trips = {{2, 1, 5}, {3, 5, 7}};
        Assertions.assertTrue(solution.carPooling(trips, 3));
    }

    @Test
    void t4() {
        int[][] trips = {{3, 2, 7}, {3, 7, 9}, {8, 3, 9}};
        Assertions.assertTrue(solution.carPooling(trips, 11));
    }

    @Test
    void t5() {
        int[][] trips = {{9, 3, 4}, {9, 1, 7}, {4, 2, 4}, {7, 4, 5}};
        Assertions.assertTrue(solution.carPooling(trips, 23));
    }
}
