package com.raphael.lc.p338;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-03 09:57:29
 */
class CountBitsTest {

    private final CountBits solution = new CountBits();

    @Test
    void t1() {
        Assertions.assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, solution.countBits(5));
    }
}
