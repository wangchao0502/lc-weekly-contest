package com.raphael.lc.p927;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-20 14:12:51
 */
class ThreeEqualPartsTest {

    private final ThreeEqualParts solution = new ThreeEqualParts();

    @Test
    void t1() {
        int[] arr = {1, 0, 1, 0, 1};
        int[] ans = {0, 3};
        Assertions.assertArrayEquals(ans, solution.threeEqualParts(arr));
    }

    @Test
    void t2() {
        int[] arr = {1, 1, 0, 1, 1};
        int[] ans = {-1, -1};
        Assertions.assertArrayEquals(ans, solution.threeEqualParts(arr));
    }

    @Test
    void t3() {
        int[] arr = {1, 1, 0, 0, 1};
        int[] ans = {0, 2};
        Assertions.assertArrayEquals(ans, solution.threeEqualParts(arr));
    }

    @Test
    void t4() {
        int[] arr = {1, 0, 1, 1, 0};
        int[] ans = {-1, -1};
        Assertions.assertArrayEquals(ans, solution.threeEqualParts(arr));
    }

    @Test
    void t5() {
        int[] arr = {0, 0, 0, 0, 0};
        int[] ans = {0, 4};
        Assertions.assertArrayEquals(ans, solution.threeEqualParts(arr));
    }

    @Test
    void t6() {
        int[] arr = {0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1};
        int[] ans = {-1, -1};
        Assertions.assertArrayEquals(ans, solution.threeEqualParts(arr));
    }
}
