package com.raphael.lc.p1734;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-11 09:57:42
 */
class DecodeTest {

    private final Decode solution = new Decode();

    @Test
    void t1() {
        int[] encoded = {3, 1};
        int[] perm = {1, 2, 3};
        Assertions.assertArrayEquals(perm, solution.decode(encoded));
    }

    @Test
    void t2() {
        int[] encoded = {6, 5, 4, 6};
        int[] perm = {2, 4, 1, 5, 3};
        Assertions.assertArrayEquals(perm, solution.decode(encoded));
    }
}
