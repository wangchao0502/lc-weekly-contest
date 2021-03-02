package com.raphael.lc.p303;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-01 19:33:44
 */
class SumRangeTest {
    @Test
    void t1() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray arr = new NumArray(nums);
        Assertions.assertEquals(1, arr.sumRange(0, 2));
        Assertions.assertEquals(-1, arr.sumRange(2, 5));
        Assertions.assertEquals(-3, arr.sumRange(0, 5));
    }
}
