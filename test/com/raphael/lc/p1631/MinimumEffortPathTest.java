package com.raphael.lc.p1631;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-29 21:23:21
 */
class MinimumEffortPathTest {

    private final MinimumEffortPath solution = new MinimumEffortPath();

    @Test
    void t1() {
        int[][] heights = {{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        Assertions.assertEquals(2, solution.minimumEffortPath(heights));
    }
}
