package com.raphael.lc.weekly224.p5243;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-17 10:42:14
 */
class TupleSameProductTest {

    private final TupleSameProduct solution = new TupleSameProduct();

    @Test
    void t1() {
        int[] nums = {2, 3, 4, 6};
        Assertions.assertEquals(8, solution.tupleSameProduct(nums));
    }

    @Test
    void t2() {
        int[] nums = {1, 2, 4, 5, 10};
        Assertions.assertEquals(16, solution.tupleSameProduct(nums));
    }
}
