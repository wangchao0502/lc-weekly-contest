package com.raphael.lc.p72;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-30 16:12:15
 */
class MinDistanceTest {

    private final MinDistance solution = new MinDistance();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.minDistance("horse", "ros"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(5, solution.minDistance("intention", "execution"));
    }
}
