package com.raphael.lc.p765;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-14 12:57:31
 */
class MinSwapsCouplesTest {

    private final MinSwapsCouples solution = new MinSwapsCouples();

    @Test
    void t1() {
        int[] row = {0, 2, 1, 3};
        Assertions.assertEquals(1, solution.minSwapsCouples(row));
    }

    @Test
    void t2() {
        int[] row = {3, 2, 0, 1};
        Assertions.assertEquals(0, solution.minSwapsCouples(row));
    }

    @Test
    void t3() {
        int[] row = {1, 4, 0, 5, 8, 7, 6, 3, 2, 9};
        Assertions.assertEquals(3, solution.minSwapsCouples(row));
    }
}
