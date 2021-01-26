package com.raphael.lc.p44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-26 21:14:54
 */
class IsMatchTest {

    private final IsMatch solution = new IsMatch();

    @Test
    void t1() {
        Assertions.assertFalse(solution.isMatch("aa", "a"));
    }

    @Test
    void t2() {
        Assertions.assertTrue(solution.isMatch("aa", "*"));
    }

    @Test
    void t3() {
        Assertions.assertTrue(solution.isMatch("adceb", "*a*b"));
    }
}
