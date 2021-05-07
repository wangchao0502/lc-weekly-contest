package com.raphael.lc.p1486;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-07 10:47:12
 */
class XorOperationTest {

    private final XorOperation solution = new XorOperation();

    @Test
    void t1() {
        Assertions.assertEquals(8, solution.xorOperation(5, 0));
    }

    @Test
    void t2() {
        Assertions.assertEquals(8, solution.xorOperation(4, 3));
    }

    @Test
    void t3() {
        Assertions.assertEquals(7, solution.xorOperation(1, 7));
    }

    @Test
    void t4() {
        Assertions.assertEquals(2, solution.xorOperation(10, 5));
    }
}
