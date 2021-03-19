package com.raphael.lc.offer43;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-19 10:32:25
 */
class CountDigitOneTest {

    private final CountDigitOne solution = new CountDigitOne();

    @Test
    void t1() {
        Assertions.assertEquals(5, solution.countDigitOne(12));
    }

    @Test
    void t2() {
        Assertions.assertEquals(6, solution.countDigitOne(13));
    }
}
