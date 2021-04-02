package com.raphael.lc.mst1721;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-02 10:56:43
 */
class TrapTest {

    private final Trap solution = new Trap();

    @Test
    void t1() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Assertions.assertEquals(6, solution.trap(height));
    }
}
