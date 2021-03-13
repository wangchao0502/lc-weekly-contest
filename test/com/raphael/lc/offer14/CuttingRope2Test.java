package com.raphael.lc.offer14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-13 14:25:19
 */
class CuttingRope2Test {

    private final CuttingRope2 solution = new CuttingRope2();

    @Test
    void t1() {
        Assertions.assertEquals(1, solution.cuttingRope2(2));
    }

    @Test
    void t2() {
        Assertions.assertEquals(36, solution.cuttingRope2(10));
    }
}
