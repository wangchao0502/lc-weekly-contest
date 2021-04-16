package com.raphael.lc.p87;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-16 13:04:03
 */
class IsScrambleTest {

    private final IsScramble solution = new IsScramble();

    @Test
    void t1() {
        Assertions.assertTrue(solution.isScramble("great", "rgeat"));
    }

    @Test
    void t2() {
        Assertions.assertFalse(solution.isScramble("abcde", "caebd"));
    }

    @Test
    void t3() {
        Assertions.assertTrue(solution.isScramble("a", "a"));
    }

    @Test
    void t4() {
        Assertions.assertTrue(solution.isScramble("abc", "bca"));
    }
}
