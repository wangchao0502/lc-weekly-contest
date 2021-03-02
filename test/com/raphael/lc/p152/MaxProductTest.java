package com.raphael.lc.p152;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-27 17:04:25
 */
class MaxProductTest {

    private final MaxProduct solution = new MaxProduct();

    @Test
    void t1() {
        int[] nums = {2, 3, -2, 4};
        Assertions.assertEquals(6, solution.maxProduct(nums));
    }

    @Test
    void t2() {
        int[] nums = {-2, 0, -1};
        Assertions.assertEquals(0, solution.maxProduct(nums));
    }
}
