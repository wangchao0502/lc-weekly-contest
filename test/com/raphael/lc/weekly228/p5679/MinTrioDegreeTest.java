package com.raphael.lc.weekly228.p5679;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-14 10:42:03
 */
class MinTrioDegreeTest {

    private final MinTrioDegree solution = new MinTrioDegree();

    @Test
    void t1() {
        int[][] edges = {{1, 2}, {1, 3}, {3, 2}, {4, 1}, {5, 2}, {3, 6}};
        Assertions.assertEquals(3, solution.minTrioDegree(6, edges));
    }
}
