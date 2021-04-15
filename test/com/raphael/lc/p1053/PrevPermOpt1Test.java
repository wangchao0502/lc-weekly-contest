package com.raphael.lc.p1053;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-15 11:32:43
 */
class PrevPermOpt1Test {

    private final PrevPermOpt1 solution = new PrevPermOpt1();

    @Test
    void t1() {
        int[] arr = {3, 2, 1};
        int[] ans = {3, 1, 2};
        Assertions.assertArrayEquals(ans, solution.prevPermOpt1(arr));

    }

    @Test
    void t2() {
        int[] arr = {1, 1, 5};
        int[] ans = {1, 1, 5};
        Assertions.assertArrayEquals(ans, solution.prevPermOpt1(arr));
    }

    @Test
    void t3() {
        int[] arr = {1, 9, 4, 6, 7};
        int[] ans = {1, 7, 4, 6, 9};
        Assertions.assertArrayEquals(ans, solution.prevPermOpt1(arr));
    }

    @Test
    void t4() {
        int[] arr = {3, 1, 1, 3};
        int[] ans = {1, 3, 1, 3};
        Assertions.assertArrayEquals(ans, solution.prevPermOpt1(arr));
    }

    @Test
    void t5() {
        int[] arr = {2, 1, 2, 1, 1, 2, 2, 1};
        int[] ans = {2, 1, 2, 1, 1, 2, 1, 2};
        Assertions.assertArrayEquals(ans, solution.prevPermOpt1(arr));
    }
}
