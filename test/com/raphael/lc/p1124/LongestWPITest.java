package com.raphael.lc.p1124;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-30 18:19:12
 */
class LongestWPITest {

    private final LongestWPI solution = new LongestWPI();

    @Test
    void t1() {
        int[] hours = {9, 9, 6, 0, 6, 6, 9};
        Assertions.assertEquals(3, solution.longestWPI(hours));
    }
}
