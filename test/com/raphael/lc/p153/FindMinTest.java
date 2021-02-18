package com.raphael.lc.p153;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-18 15:14:09
 */
class FindMinTest {

    private final FindMin solution = new FindMin();

    @Test
    void t1() {
        int[] nums = {3, 4, 5, 1, 2};
        Assertions.assertEquals(1, solution.findMin(nums));
    }

    @Test
    void t2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        Assertions.assertEquals(0, solution.findMin(nums));
    }

    @Test
    void t3() {
        int[] nums = {1};
        Assertions.assertEquals(1, solution.findMin(nums));
    }

    @Test
    void t4() {
        int[] nums = {2, 1};
        Assertions.assertEquals(1, solution.findMin(nums));
    }

    @Test
    void t5() {
        int[] nums = {2, 3, 1};
        Assertions.assertEquals(1, solution.findMin(nums));
    }
}
