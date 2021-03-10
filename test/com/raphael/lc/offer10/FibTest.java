package com.raphael.lc.offer10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-10 13:37:15
 */
class FibTest {

    private final Fib solution = new Fib();

    @Test
    void t1() {
        Assertions.assertEquals(1, solution.fib(2));
    }

    @Test
    void t2() {
        Assertions.assertEquals(5, solution.fib(5));
    }
}
