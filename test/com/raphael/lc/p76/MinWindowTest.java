package com.raphael.lc.p76;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-02 11:45:15
 */
class MinWindowTest {

    private final MinWindow solution = new MinWindow();

    @Test
    void t1() {
        Assertions.assertEquals("BANC", solution.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    void t2() {
        Assertions.assertEquals("a", solution.minWindow("a", "a"));
    }
}
