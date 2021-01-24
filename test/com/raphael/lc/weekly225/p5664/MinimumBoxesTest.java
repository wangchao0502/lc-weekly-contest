package com.raphael.lc.weekly225.p5664;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-24 11:54:56
 */
class MinimumBoxesTest {

    private final MinimumBoxes solution = new MinimumBoxes();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.minimumBoxes(3));
    }
}
