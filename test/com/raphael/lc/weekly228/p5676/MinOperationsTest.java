package com.raphael.lc.weekly228.p5676;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-14 10:40:59
 */
class MinOperationsTest {

    private final MinOperations solution = new MinOperations();

    @Test
    void t1() {
        Assertions.assertEquals(1, solution.minOperations("0100"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(0, solution.minOperations("01"));
    }
}
