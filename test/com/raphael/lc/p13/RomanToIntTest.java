package com.raphael.lc.p13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-15 13:07:44
 */
class RomanToIntTest {

    private final RomanToInt solution = new RomanToInt();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(4, solution.romanToInt("IV"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(9, solution.romanToInt("IX"));
    }
}
