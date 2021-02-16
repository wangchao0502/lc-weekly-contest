package com.raphael.lc.p561;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-16 12:18:46
 */
class ArrayPairSumTest {

    private final ArrayPairSum solution = new ArrayPairSum();

    @Test
    void t1() {
        int[] nums = {1, 4, 3, 2};
        Assertions.assertEquals(4, solution.arrayPairSum(nums));
    }

    @Test
    void t2() {
        int[] nums = {6, 2, 6, 5, 1, 2};
        Assertions.assertEquals(9, solution.arrayPairSum(nums));
    }
}
