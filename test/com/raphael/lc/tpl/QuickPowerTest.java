package com.raphael.lc.tpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-31 23:49:28
 */
class QuickPowerTest {

    private final QuickPower solution = new QuickPower();

    @Test
    void t1() {
        Assertions.assertEquals(1000, solution.quickPower(10, 3));
    }

    @Test
    void t2() {
        Assertions.assertEquals(256, solution.quickPower(2, 8));
    }
}
