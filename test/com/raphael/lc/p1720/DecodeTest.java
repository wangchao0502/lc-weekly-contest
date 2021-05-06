package com.raphael.lc.p1720;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-06 13:36:18
 */
class DecodeTest {

    private final Decode solution = new Decode();

    @Test
    void t1() {
        int[] encoded = {1, 2, 3};
        int[] ans = {1, 0, 2, 1};
        Assertions.assertArrayEquals(ans, solution.decode(encoded, 1));
    }

    @Test
    void t2() {
        int[] encoded = {6, 2, 7, 3};
        int[] ans = {4, 2, 0, 7, 4};
        Assertions.assertArrayEquals(ans, solution.decode(encoded, 4));
    }
}
