package com.raphael.lc.p55;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-11 10:30:03
 */
class CanJumpTest {

    private final CanJump solution = new CanJump();

    @Test
    void t1() {
        Assertions.assertTrue(solution.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    void t2() {
        Assertions.assertFalse(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    void t3() {
        Assertions.assertFalse(solution.canJump(new int[]{0, 1}));
    }
}
