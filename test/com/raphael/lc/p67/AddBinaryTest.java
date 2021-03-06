package com.raphael.lc.p67;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-06 22:07:40
 */
class AddBinaryTest {

    private final AddBinary solution = new AddBinary();

    @Test
    void t1() {
        Assertions.assertEquals("100", solution.addBinary("11", "1"));
    }
}
