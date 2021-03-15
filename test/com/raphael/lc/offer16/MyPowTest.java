package com.raphael.lc.offer16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-15 11:01:31
 */
class MyPowTest {

    private final MyPow solution = new MyPow();

    @Test
    void t1() {
        Assertions.assertEquals(1024, solution.myPow(2, 10));
    }

    @Test
    void t2() {
        Assertions.assertEquals(0.25, solution.myPow(2, -2));
    }

    @Test
    void t3() {
        Assertions.assertEquals(0, solution.myPow(2, -2147483648));
    }
}
