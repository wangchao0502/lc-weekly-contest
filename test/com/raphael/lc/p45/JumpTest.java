package com.raphael.lc.p45;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-09 15:31:33
 */
class JumpTest {

    private final Jump solution = new Jump();

    @Test
    void t1() {
        int[] nums = {2, 3, 1, 1, 4};
        Assertions.assertEquals(2, solution.jump(nums));
    }

    @Test
    void t2() {
        int[] nums = {2, 2, 1, 4, 4};
        Assertions.assertEquals(3, solution.jump(nums));
    }
}
