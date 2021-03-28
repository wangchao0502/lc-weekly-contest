package com.raphael.lc.weekly234.p5715;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-28 10:38:07
 */
class ReinitializePermutationTest {

    private final ReinitializePermutation solution = new ReinitializePermutation();

    @Test
    void t1() {
        Assertions.assertEquals(1, solution.reinitializePermutation(2));
    }

    @Test
    void t2() {
        Assertions.assertEquals(2, solution.reinitializePermutation(4));
    }

    @Test
    void t3() {
        Assertions.assertEquals(4, solution.reinitializePermutation(6));
    }
}
