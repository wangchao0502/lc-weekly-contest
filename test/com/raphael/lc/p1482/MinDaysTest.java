package com.raphael.lc.p1482;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-09 13:10:08
 */
class MinDaysTest {

    private final MinDays solution = new MinDays();

    @Test
    void t1() {
        int[] bloomDay = {7, 7, 7, 7, 12, 7, 7};
        Assertions.assertEquals(12, solution.minDays(bloomDay, 2, 3));
    }

    @Test
    void t2() {
        int[] bloomDay = {1, 10, 3, 10, 2};
        Assertions.assertEquals(3, solution.minDays(bloomDay, 3, 1));
    }

    @Test
    void t3() {
        int[] bloomDay = {1, 10, 3, 10, 2};
        Assertions.assertEquals(-1, solution.minDays(bloomDay, 3, 2));
    }

    @Test
    void t4() {
        int[] bloomDay = {100000, 100000};
        Assertions.assertEquals(100000, solution.minDays(bloomDay, 1, 1));
    }

    @Test
    void t5() {
        int[] bloomDay = {1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
        Assertions.assertEquals(9, solution.minDays(bloomDay, 4, 2));
    }
}
