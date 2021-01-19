package com.raphael.lc.p628;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-20 00:07:49
 */
class MaximumProductTest {

    private final MaximumProduct solution = new MaximumProduct();

    @Test
    void t1() {
        Assertions.assertEquals(24, solution.maximumProduct(new int[]{1, 2, 3, 4}));
    }
}
