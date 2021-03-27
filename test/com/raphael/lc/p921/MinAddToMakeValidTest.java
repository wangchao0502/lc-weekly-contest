package com.raphael.lc.p921;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-27 17:51:43
 */
class MinAddToMakeValidTest {

    private final MinAddToMakeValid solution = new MinAddToMakeValid();

    @Test
    void t1() {
        Assertions.assertEquals(1, solution.minAddToMakeValid("())"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(3, solution.minAddToMakeValid("((("));
    }

    @Test
    void t3() {
        Assertions.assertEquals(0, solution.minAddToMakeValid("()"));
    }

    @Test
    void t4() {
        Assertions.assertEquals(4, solution.minAddToMakeValid("()))(("));
    }
}
