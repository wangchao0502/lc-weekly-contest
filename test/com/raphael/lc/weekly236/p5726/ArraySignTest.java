package com.raphael.lc.weekly236.p5726;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-11 10:36:15
 */
class ArraySignTest {

    private final ArraySign solution = new ArraySign();

    @Test
    void t1() {
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
        Assertions.assertEquals(1, solution.arraySign(nums));
    }

    @Test
    void t2() {
        int[] nums = {1, 5, 0, 2, -3};
        Assertions.assertEquals(0, solution.arraySign(nums));
    }

    @Test
    void t3() {
        int[] nums = {-1, 1, -1, 1, -1};
        Assertions.assertEquals(-1, solution.arraySign(nums));
    }
}
