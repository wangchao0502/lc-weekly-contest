package com.raphael.lc.p421;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-16 11:18:32
 */
class FindMaximumXORTest {

    private final FindMaximumXOR solution = new FindMaximumXOR();

    @Test
    void t1() {
        int[] nums = {3, 10, 5, 25, 2, 8};
        Assertions.assertEquals(28, solution.findMaximumXOR(nums));
    }
}
