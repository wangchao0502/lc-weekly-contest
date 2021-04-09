package com.raphael.lc.p944;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-09 18:08:56
 */
class MinDeletionSizeTest {

    private final MinDeletionSize solution = new MinDeletionSize();

    @Test
    void t1() {
        String[] strs = {"cba", "daf", "ghi"};
        Assertions.assertEquals(1, solution.minDeletionSize(strs));
    }

    @Test
    void t2() {
        String[] strs = {"a", "b"};
        Assertions.assertEquals(0, solution.minDeletionSize(strs));
    }

    @Test
    void t3() {
        String[] strs = {"zyx", "wvu", "tsr"};
        Assertions.assertEquals(3, solution.minDeletionSize(strs));
    }
}
