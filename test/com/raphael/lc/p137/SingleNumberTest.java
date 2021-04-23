package com.raphael.lc.p137;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-23 10:24:06
 */
class SingleNumberTest {

    private final SingleNumber solution = new SingleNumber();

    @Test
    void t1() {
        int[] nums = {2, 2, 3, 2};
        Assertions.assertEquals(3, solution.singleNumber(nums));
    }

    @Test
    void t2() {
        int[] nums = {0, 1, 0, 1, 0, 1, 99};
        Assertions.assertEquals(99, solution.singleNumber(nums));
    }
}
