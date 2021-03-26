package com.raphael.lc.p907;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-26 12:09:00
 */
class SumSubarrayMinsTest {

    private final SumSubarrayMins solution = new SumSubarrayMins();

    @Test
    void t1() {
        int[] arr = {3, 1, 2, 4};
        Assertions.assertEquals(17, solution.sumSubarrayMins(arr));
    }

    @Test
    void t2() {
        int[] arr = {11, 81, 94, 43, 3};
        Assertions.assertEquals(444, solution.sumSubarrayMins(arr));
    }
}
