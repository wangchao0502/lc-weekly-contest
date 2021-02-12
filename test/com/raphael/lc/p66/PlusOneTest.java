package com.raphael.lc.p66;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-12 12:24:42
 */
class PlusOneTest {

    private final PlusOne solution = new PlusOne();

    @Test
    void t1() {
        Assertions.assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    void t2() {
        Assertions.assertArrayEquals(new int[]{4, 3, 2, 2}, solution.plusOne(new int[]{4, 3, 2, 1}));
    }

    @Test
    void t3() {
        Assertions.assertArrayEquals(new int[]{1}, solution.plusOne(new int[]{0}));
    }

    @Test
    void t4() {
        Assertions.assertArrayEquals(new int[]{1, 0, 0}, solution.plusOne(new int[]{9, 9}));
    }
}

