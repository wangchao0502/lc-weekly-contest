package com.raphael.lc.p43;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-18 21:31:33
 */
class MultiplyTest {

    private final Multiply solution = new Multiply();

    @Test
    void t1() {
        Assertions.assertEquals("56088", solution.multiply("123", "456"));
    }
}
