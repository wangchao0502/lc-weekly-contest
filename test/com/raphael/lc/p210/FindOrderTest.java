package com.raphael.lc.p210;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-12 16:04:49
 */
class FindOrderTest {

    private final FindOrder solution = new FindOrder();

    @Test
    void t1() {
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        // [0,1,2,3] or [0,2,1,3]
        int[] ans = new int[]{0, 1, 2, 3};
        Assertions.assertArrayEquals(ans, solution.findOrder(4, prerequisites));
    }

    @Test
    void t2() {
        int[][] prerequisites = {{1, 0}, {0, 1}};
        int[] ans = new int[]{};
        Assertions.assertArrayEquals(ans, solution.findOrder(2, prerequisites));
    }
}
