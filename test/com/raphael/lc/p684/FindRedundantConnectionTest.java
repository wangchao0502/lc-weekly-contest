package com.raphael.lc.p684;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-13 10:13:09
 */
class FindRedundantConnectionTest {

    private final FindRedundantConnection solution = new FindRedundantConnection();

    @Test
    void t1() {
        int[][] edges = {{1, 2}, {1, 3}, {2, 3}};
        Assertions.assertArrayEquals(new int[]{2, 3}, solution.findRedundantConnection(edges));
    }
}
