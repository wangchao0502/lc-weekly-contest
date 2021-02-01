package com.raphael.lc.p888;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-01 11:49:15
 */
class FairCandySwapTest {

    private final FairCandySwap solution = new FairCandySwap();

    @Test
    void t1() {
        int[] a = {1, 1};
        int[] b = {2, 2};
        Assertions.assertArrayEquals(new int[]{1, 2}, solution.fairCandySwap(a, b));
    }

    @Test
    void t2() {
        int[] a = {1, 2, 5};
        int[] b = {2, 4};
        Assertions.assertArrayEquals(new int[]{5, 4}, solution.fairCandySwap(a, b));
    }
}
