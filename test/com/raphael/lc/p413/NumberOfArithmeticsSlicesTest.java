package com.raphael.lc.p413;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-06 21:50:01
 */
class NumberOfArithmeticsSlicesTest {

    private final NumberOfArithmeticsSlices solution = new NumberOfArithmeticsSlices();

    @Test
    void t1() {
        int[] nums = {1, 2, 3, 4};
        Assertions.assertEquals(3, solution.numberOfArithmeticsSlices(nums));
    }
}
