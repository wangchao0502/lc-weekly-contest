package com.raphael.lc.p685;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-18 11:54:31
 */
class FindRedundantDirectedConnectionTest {

    private final FindRedundantDirectedConnection solution = new FindRedundantDirectedConnection();

    @Test
    void t1() {
        int[][] edges = {{1, 2}, {1, 3}, {2, 3}};
        int[] ans = {2, 3};
        Assertions.assertArrayEquals(ans, solution.findRedundantDirectedConnection(edges));
    }

    @Test
    void t2() {
        int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {4, 1}, {1, 5}};
        int[] ans = {4, 1};
        Assertions.assertArrayEquals(ans, solution.findRedundantDirectedConnection(edges));
    }
}
