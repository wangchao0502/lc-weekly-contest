package com.raphael.lc.weekly226.p5667;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-31 11:24:19
 */
class CanEatTest {

    private final CanEat solution = new CanEat();

    @Test
    void t1() {
        int[] candiesCount = {7, 4, 5, 3, 8};
        int[][] queries = {{0, 2, 2}, {4, 2, 4}, {2, 13, 1000000000}};
        boolean[] result = {true, false, true};
        Assertions.assertArrayEquals(result, solution.canEat(candiesCount, queries));
    }
}
