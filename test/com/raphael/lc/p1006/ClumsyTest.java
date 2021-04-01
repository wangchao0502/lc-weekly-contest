package com.raphael.lc.p1006;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-01 11:25:50
 */
class ClumsyTest {

    private final Clumsy solution = new Clumsy();

    @Test
    void t1() {
        Assertions.assertEquals(7, solution.clumsy(4));
    }

    @Test
    void t2() {
        Assertions.assertEquals(12, solution.clumsy(10));
    }
}
