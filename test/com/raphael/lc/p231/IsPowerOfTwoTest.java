package com.raphael.lc.p231;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-30 09:56:29
 */
class IsPowerOfTwoTest {

    private final IsPowerOfTwo solution = new IsPowerOfTwo();

    @Test
    void t1() {
        Assertions.assertTrue(solution.isPowerOfTwo(1));
    }

    @Test
    void t2() {
        Assertions.assertFalse(solution.isPowerOfTwo(3));
    }

    @Test
    void t3() {
        Assertions.assertTrue(solution.isPowerOfTwo(4));
    }
}
