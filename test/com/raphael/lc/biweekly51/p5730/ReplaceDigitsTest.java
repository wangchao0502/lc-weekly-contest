package com.raphael.lc.biweekly51.p5730;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-01 22:55:05
 */
class ReplaceDigitsTest {

    private final ReplaceDigits solution = new ReplaceDigits();

    @Test
    void t1() {
        Assertions.assertEquals("abcdef", solution.replaceDigits("a1c1e1"));
    }

    @Test
    void t2() {
        Assertions.assertEquals("abbdcfdhe", solution.replaceDigits("a1b2c3d4e"));
    }
}
