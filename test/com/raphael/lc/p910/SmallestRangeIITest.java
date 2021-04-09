package com.raphael.lc.p910;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-09 17:14:50
 */
class SmallestRangeIITest {

    private final SmallestRangeII solution = new SmallestRangeII();

    @Test
    void t1() {
        int[] a = {1};
        Assertions.assertEquals(0, solution.smallestRangeII(a, 0));
    }

    @Test
    void t2() {
        int[] a = {0, 10};
        Assertions.assertEquals(6, solution.smallestRangeII(a, 2));
    }

    @Test
    void t3() {
        int[] a = {1, 3, 6};
        Assertions.assertEquals(3, solution.smallestRangeII(a, 3));
    }

    @Test
    void t4() {
        int[] a = {2, 7, 2};
        Assertions.assertEquals(3, solution.smallestRangeII(a, 1));
    }

    @Test
    void t5() {
        int[] a = {7, 8, 8};
        Assertions.assertEquals(1, solution.smallestRangeII(a, 5));
    }

    @Test
    void t6() {
        int[] a = {4, 8, 2, 7, 2};
        Assertions.assertEquals(6, solution.smallestRangeII(a, 5));
    }
}
