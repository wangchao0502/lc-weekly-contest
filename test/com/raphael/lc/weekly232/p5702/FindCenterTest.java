package com.raphael.lc.weekly232.p5702;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-14 10:48:19
 */
class FindCenterTest {

    private final FindCenter solution = new FindCenter();

    @Test
    void t1() {
        int[][] edges = {{1, 2}, {2, 3}, {4, 2}};
        Assertions.assertEquals(2, solution.findCenter(edges));
    }

    @Test
    void t2() {
        int[][] edges = {{1, 2}, {5, 1}, {1, 3}, {1, 4}};
        Assertions.assertEquals(1, solution.findCenter(edges));
    }
}
