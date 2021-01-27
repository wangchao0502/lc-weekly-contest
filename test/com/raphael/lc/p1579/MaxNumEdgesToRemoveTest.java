package com.raphael.lc.p1579;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-27 20:36:42
 */
class MaxNumEdgesToRemoveTest {

    private final MaxNumEdgesToRemove solution = new MaxNumEdgesToRemove();

    @Test
    void t1() {
        int[][] edges = {{3, 1, 2}, {3, 2, 3}, {1, 1, 3}, {1, 2, 4}, {1, 1, 2}, {2, 3, 4}};
        Assertions.assertEquals(2, solution.maxNumEdgesToRemove(4, edges));
    }
}
