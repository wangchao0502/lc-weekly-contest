package com.raphael.lc.p29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-08 17:33:47
 */
class DivideTest {

    private final Divide solution = new Divide();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.divide(10, 3));
    }
}