package com.raphael.lc.p1111;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-17 10:30:09
 */
class MaxDepthAfterSplitTest {

    private final MaxDepthAfterSplit solution = new MaxDepthAfterSplit();

    @Test
    void t1() {
        int[] ans = {0, 1, 1, 1, 1, 0};
        Assertions.assertArrayEquals(ans, solution.maxDepthAfterSplit("(()())"));
    }

    @Test
    void t2() {
        int[] ans = {0, 0, 0, 1, 1, 0, 0, 0};
        Assertions.assertArrayEquals(ans, solution.maxDepthAfterSplit("()(())()"));
    }
}
