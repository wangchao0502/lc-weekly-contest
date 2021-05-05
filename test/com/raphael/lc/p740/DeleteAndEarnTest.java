package com.raphael.lc.p740;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-05 11:50:42
 */
class DeleteAndEarnTest {

    private final DeleteAndEarn solution = new DeleteAndEarn();

    @Test
    void t1() {
        int[] nums = {3, 4, 2};
        Assertions.assertEquals(6, solution.deleteAndEarn(nums));
    }

    @Test
    void t2() {
        int[] nums = {2, 2, 3, 3, 3, 4};
        Assertions.assertEquals(9, solution.deleteAndEarn(nums));
    }
}
