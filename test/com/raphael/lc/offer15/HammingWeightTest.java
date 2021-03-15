package com.raphael.lc.offer15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-15 10:55:43
 */
class HammingWeightTest {

    private final HammingWeight solution = new HammingWeight();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.hammingWeight(0b1011));
    }

    @Test
    void t2() {
        Assertions.assertEquals(1, solution.hammingWeight(0b1000000000000));
    }

    @Test
    void t3() {
        Assertions.assertEquals(31, solution.hammingWeight(0b11111111111111111111111111111101));
    }
}
