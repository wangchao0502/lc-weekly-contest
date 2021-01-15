package com.raphael.lc.p307;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-15 22:27:37
 */
class NumArrayTest {
    @Test
    void t1() {
        NumArray numArray = new NumArray(new int[]{1, 3, 5});
        Assertions.assertEquals(9, numArray.sumRange(0, 2));
        numArray.update(1, 2);
        Assertions.assertEquals(8, numArray.sumRange(0, 2));
        numArray.update(2, 3);
        Assertions.assertEquals(6, numArray.sumRange(0, 2));
    }
}
