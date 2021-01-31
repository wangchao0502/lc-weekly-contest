package com.raphael.lc.tpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-31 23:43:40
 */
class QuickPowerModTest {

    private final QuickPowerMod solution = new QuickPowerMod();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.quickPowerMod(10, 3, 997));
    }

    @Test
    void t2() {
        Assertions.assertEquals(0, solution.quickPowerMod(10, 3, 10));
    }
}
