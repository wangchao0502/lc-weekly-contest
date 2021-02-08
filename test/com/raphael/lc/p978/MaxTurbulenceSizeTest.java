package com.raphael.lc.p978;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-08 13:52:12
 */
class MaxTurbulenceSizeTest {

    private final MaxTurbulenceSize solution = new MaxTurbulenceSize();

    @Test
    void t1() {
        int[] input = {9, 4, 2, 10, 7, 8, 8, 1, 9};
        Assertions.assertEquals(5, solution.maxTurbulenceSize(input));
    }

    @Test
    void t2() {
        int[] input = {4, 8, 12, 16};
        Assertions.assertEquals(2, solution.maxTurbulenceSize(input));
    }

    @Test
    void t3() {
        int[] input = {37, 199, 60, 296, 257, 248, 115, 31, 273, 176};
        Assertions.assertEquals(5, solution.maxTurbulenceSize(input));
    }
}
