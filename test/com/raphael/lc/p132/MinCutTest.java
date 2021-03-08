package com.raphael.lc.p132;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-08 12:01:29
 */
class MinCutTest {

    private final MinCut solution = new MinCut();

    @Test
    void t1() {
        Assertions.assertEquals(1, solution.minCut("aab"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(0, solution.minCut("a"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(1, solution.minCut("ab"));
    }

    @Test
    void t4() {
        Assertions.assertEquals(1, solution.minCut("abbab"));
    }
}
