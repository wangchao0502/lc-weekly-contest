package com.raphael.lc.offer66;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-22 14:43:16
 */
class ConstructArrTest {

    private final ConstructArr solution = new ConstructArr();

    @Test
    void t1() {
        int[] a = {1, 2, 3, 4, 5};
        int[] result = {120, 60, 40, 30, 24};
        Assertions.assertArrayEquals(result, solution.constructArr(a));
    }
}
