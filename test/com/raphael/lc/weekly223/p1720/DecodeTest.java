package com.raphael.lc.weekly223.p1720;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-10 10:30:54
 */
class DecodeTest {

    private final Decode solution = new Decode();

    @Test
    void t1() {
        int[] expect = {1, 0, 2, 1};
        int[] encoded = {1, 2, 3};
        Assertions.assertArrayEquals(expect, solution.decode(encoded, 1));
    }
}
