package com.raphael.lc.biweekly51.p5732;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-01 23:14:35
 */
class MaximumElementAfterDecrementingAndRearrangingTest {

    private final MaximumElementAfterDecrementingAndRearranging solution = new MaximumElementAfterDecrementingAndRearranging();

    @Test
    void t1() {
        int[] arr = {2, 2, 1, 2, 1};
        Assertions.assertEquals(2, solution.maximumElementAfterDecrementingAndRearranging(arr));
    }

    @Test
    void t2() {
        int[] arr = {100, 1, 1000};
        Assertions.assertEquals(3, solution.maximumElementAfterDecrementingAndRearranging(arr));
    }

    @Test
    void t3() {
        int[] arr = {1, 2, 3, 4, 5};
        Assertions.assertEquals(5, solution.maximumElementAfterDecrementingAndRearranging(arr));
    }

    @Test
    void t4() {
        int[] arr = {73, 98, 9};
        Assertions.assertEquals(3, solution.maximumElementAfterDecrementingAndRearranging(arr));
    }
}
