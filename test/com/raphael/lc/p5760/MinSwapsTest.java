package com.raphael.lc.p5760;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-16 10:44:09
 */
class MinSwapsTest {

    private final MinSwaps solution = new MinSwaps();

    @Test
    void t1() {
        Assertions.assertEquals(1, solution.minSwaps("111000"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(0, solution.minSwaps("010"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(-1, solution.minSwaps("1110"));
    }

    @Test
    void t4() {
        Assertions.assertEquals(1, solution.minSwaps("100"));
    }

    @Test
    void t5() {
        Assertions.assertEquals(60, solution.minSwaps("1110000000100001010100101010000101010101001000001110101000010111101100000111110001000111010111101100001100001001100101011110100011111100000000100011111011110111111011110111010100111101011111111101101100101010110000011110110100101111000100000001100000"));
    }
}
