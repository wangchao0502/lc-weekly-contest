package com.raphael.lc.offer14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-13 14:01:04
 */
class CuttingRopeTest {

    private final CuttingRope solution = new CuttingRope();

    @Test
    void t1() {
        Assertions.assertEquals(1, solution.cuttingRope(2));
    }

    @Test
    void t2() {
        Assertions.assertEquals(36, solution.cuttingRope(10));
    }
}
