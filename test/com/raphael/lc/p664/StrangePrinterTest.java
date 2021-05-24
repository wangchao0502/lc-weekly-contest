package com.raphael.lc.p664;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-24 09:13:49
 */
class StrangePrinterTest {

    private final StrangePrinter solution = new StrangePrinter();

    @Test
    void t1() {
        Assertions.assertEquals(2, solution.strangePrinter("aaabbb"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(2, solution.strangePrinter("aba"));
    }
}
