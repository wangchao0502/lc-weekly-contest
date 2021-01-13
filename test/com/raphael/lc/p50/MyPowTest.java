package com.raphael.lc.p50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-13 10:52:37
 */
class MyPowTest {

    private final MyPow solution = new MyPow();

    @Test
    void t1() {
        Assertions.assertEquals(1024, solution.myPow(2, 10));
    }

    @Test
    void t2() {
        Assertions.assertEquals(9.261000000000001, solution.myPow(2.1, 3));
    }

    @Test
    void t3() {
        Assertions.assertEquals(0.25, solution.myPow(2, -2));
    }

    @Test
    void t4() {
        Assertions.assertEquals(0, solution.myPow(2, -2147483648));
    }
}
