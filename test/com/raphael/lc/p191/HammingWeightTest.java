package com.raphael.lc.p191;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-22 10:57:32
 */
class HammingWeightTest {

    private final HammingWeight solution = new HammingWeight();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.hammingWeight(0b00000000000000000000000000001011));
    }

    @Test
    void t2() {
        Assertions.assertEquals(1, solution.hammingWeight(0b00000000000000000000000010000000));
    }

    @Test
    void t3() {
        Assertions.assertEquals(31, solution.hammingWeight(0b11111111111111111111111111111101));
    }
}
