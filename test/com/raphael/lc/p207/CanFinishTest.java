package com.raphael.lc.p207;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-12 15:36:47
 */
class CanFinishTest {

    private final CanFinish solution = new CanFinish();

    @Test
    void t1() {
        int[][] prerequisites = {{1, 0}};
        Assertions.assertEquals(true, solution.canFinish(2, prerequisites));
    }

    @Test
    void t2() {
        int[][] prerequisites = {{1, 0}, {0, 1}};
        Assertions.assertEquals(false, solution.canFinish(2, prerequisites));
    }
}
