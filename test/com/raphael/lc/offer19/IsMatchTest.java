package com.raphael.lc.offer19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-15 11:28:18
 */
class IsMatchTest {

    private final IsMatch solution = new IsMatch();

    @Test
    void t1() {
        Assertions.assertFalse(solution.isMatch("aa", "a"));
    }

    @Test
    void t2() {
        Assertions.assertTrue(solution.isMatch("aa", "a*"));
    }

    @Test
    void t3() {
        Assertions.assertTrue(solution.isMatch("ab", ".*"));
    }

    @Test
    void t4() {
        Assertions.assertTrue(solution.isMatch("aab", "c*a*b"));
    }

    @Test
    void t5() {
        Assertions.assertFalse(solution.isMatch("mississippi", "mis*is*p*."));
    }
}
