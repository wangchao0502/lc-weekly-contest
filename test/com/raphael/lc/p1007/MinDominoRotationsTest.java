package com.raphael.lc.p1007;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-14 12:51:54
 */
class MinDominoRotationsTest {

    private final MinDominoRotations solution = new MinDominoRotations();

    @Test
    void t1() {
        int[] a = {2, 1, 2, 4, 2, 2};
        int[] b = {5, 2, 6, 2, 3, 2};
        Assertions.assertEquals(2, solution.minDominoRotations(a, b));
    }

    @Test
    void t2() {
        int[] a = {3, 5, 1, 2, 3};
        int[] b = {3, 6, 3, 3, 4};
        Assertions.assertEquals(-1, solution.minDominoRotations(a, b));
    }

    @Test
    void t3() {
        int[] a = {2, 1, 1, 3, 2, 1, 2, 2, 1};
        int[] b = {3, 2, 3, 1, 3, 2, 3, 3, 2};
        Assertions.assertEquals(-1, solution.minDominoRotations(a, b));
    }
}
