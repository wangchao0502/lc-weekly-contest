package com.raphael.lc.p12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-14 06:40:34
 */
class IntToRomanTest {

    private final IntToRoman solution = new IntToRoman();

    @Test
    void t1() {
        Assertions.assertEquals("III", solution.intToRoman(3));
    }

    @Test
    void t2() {
        Assertions.assertEquals("IV", solution.intToRoman(4));
    }

    @Test
    void t3() {
        Assertions.assertEquals("IX", solution.intToRoman(9));
    }

    @Test
    void t4() {
        Assertions.assertEquals("LVIII", solution.intToRoman(58));
    }

    @Test
    void t5() {
        Assertions.assertEquals("MCMXCIV", solution.intToRoman(1994));
    }
}
