package com.raphael.lc.p154;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-09 16:59:08
 */
class FindMinTest {

    private final FindMin solution = new FindMin();

    @Test
    void t1() {
        int[] nums = {1, 3, 5};
        Assertions.assertEquals(1, solution.findMin(nums));
    }

    @Test
    void t2() {
        int[] nums = {2, 2, 2, 0, 1};
        Assertions.assertEquals(0, solution.findMin(nums));
    }
}
