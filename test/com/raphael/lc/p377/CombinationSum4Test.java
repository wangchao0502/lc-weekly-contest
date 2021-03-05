package com.raphael.lc.p377;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-05 15:47:05
 */
class CombinationSum4Test {

    private final CombinationSum4 solution = new CombinationSum4();

    @Test
    void t1() {
        int[] nums = {1, 2, 3};
        Assertions.assertEquals(7, solution.combinationSum4(nums, 4));
    }

    @Test
    void t2() {
        int[] nums = {9};
        Assertions.assertEquals(0, solution.combinationSum4(nums, 3));
    }
}
