package com.raphael.lc.p1614;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-25 12:57:10
 */
class MaxDepthTest {

    private final MaxDepth solution = new MaxDepth();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(0, solution.maxDepth("1"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(1, solution.maxDepth("1+(2*3)/(2-1)"));
    }
}
