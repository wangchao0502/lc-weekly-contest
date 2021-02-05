package com.raphael.lc.p209;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-05 10:42:22
 */
class MinSubArrayLenTest {

    private final MinSubArrayLen solution = new MinSubArrayLen();

    @Test
    void t1() {
        Assertions.assertEquals(2, solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    @Test
    void t2() {
        Assertions.assertEquals(1, solution.minSubArrayLen(4, new int[]{1, 4, 4}));
    }
}
