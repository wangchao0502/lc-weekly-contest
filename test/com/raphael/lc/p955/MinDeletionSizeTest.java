package com.raphael.lc.p955;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-10 10:51:05
 */
class MinDeletionSizeTest {

    private final MinDeletionSize solution = new MinDeletionSize();

    @Test
    void t1() {
        String[] strs = {"ca", "bb", "ac"};
        Assertions.assertEquals(1, solution.minDeletionSize(strs));
    }

    @Test
    void t2() {
        String[] strs = {"xc", "yb", "za"};
        Assertions.assertEquals(0, solution.minDeletionSize(strs));
    }

    @Test
    void t3() {
        String[] strs = {"zyx", "wvu", "tsr"};
        Assertions.assertEquals(3, solution.minDeletionSize(strs));
    }

    @Test
    void t4() {
        String[] strs = {"xga", "xfb", "yfa"};
        Assertions.assertEquals(1, solution.minDeletionSize(strs));
    }

    @Test
    void t5() {
        String[] strs = {"xgaz", "xfbb", "yfax", "zfca", "zfcb"};
        Assertions.assertEquals(1, solution.minDeletionSize(strs));
    }

    @Test
    void t6() {
        String[] strs = {"abx", "agz", "bgc", "bfc"};
        Assertions.assertEquals(1, solution.minDeletionSize(strs));
    }

    @Test
    void t7() {
        String[] strs = {"vdy", "vei", "zvc", "zld"};
        Assertions.assertEquals(2, solution.minDeletionSize(strs));
    }
}
