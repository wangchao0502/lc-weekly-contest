package com.raphael.lc.p1052;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-23 14:10:52
 */
class MaxSatisfiedTest {

    private final MaxSatisfied solution = new MaxSatisfied();

    @Test
    void t1() {
        int[] customers = {1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy = {0, 1, 0, 1, 0, 1, 0, 1};
        Assertions.assertEquals(16, solution.maxSatisfied(customers, grumpy, 3));
    }

    @Test
    void t2() {
        int[] customers = {2, 6, 6, 9};
        int[] grumpy = {0, 0, 1, 1};
        Assertions.assertEquals(17, solution.maxSatisfied(customers, grumpy, 1));
    }
}
