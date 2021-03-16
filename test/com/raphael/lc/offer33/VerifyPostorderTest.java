package com.raphael.lc.offer33;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-16 18:13:13
 */
class VerifyPostorderTest {

    private final VerifyPostorder solution = new VerifyPostorder();

    @Test
    void t1() {
        int[] postorder = {1, 6, 3, 2, 5};
        Assertions.assertFalse(solution.verifyPostorder(postorder));
    }

    @Test
    void t2() {
        int[] postorder = {1, 3, 2, 6, 5};
        Assertions.assertTrue(solution.verifyPostorder(postorder));
    }
}
