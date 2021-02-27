package com.raphael.lc.p91;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-25 15:46:10
 */
class NumDecodingsTest {

    private final NumDecodings solution = new NumDecodings();

    @Test
    void t1() {
        Assertions.assertEquals(2, solution.numDecodings("12"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(3, solution.numDecodings("226"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(0, solution.numDecodings("0"));
    }

    @Test
    void t4() {
        Assertions.assertEquals(0, solution.numDecodings("06"));
    }

    @Test
    void t5() {
        Assertions.assertEquals(1, solution.numDecodings("27"));
    }

    @Test
    void t6() {
        Assertions.assertEquals(1, solution.numDecodings("2101"));
    }
}
