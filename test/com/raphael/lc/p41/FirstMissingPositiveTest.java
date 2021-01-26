package com.raphael.lc.p41;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-26 20:40:54
 */
class FirstMissingPositiveTest {

    private final FirstMissingPositive solution = new FirstMissingPositive();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.firstMissingPositive(new int[]{1, 2, 0}));
    }

    @Test
    void t2() {
        Assertions.assertEquals(2, solution.firstMissingPositive(new int[]{3, 4, -1, 1}));
    }
}
