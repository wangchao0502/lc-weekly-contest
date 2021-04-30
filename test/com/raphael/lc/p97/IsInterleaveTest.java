package com.raphael.lc.p97;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-30 16:48:44
 */
class IsInterleaveTest {

    private final IsInterleave solution = new IsInterleave();

    @Test
    void t1() {
        Assertions.assertTrue(solution.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    void t2() {
        Assertions.assertFalse(solution.isInterleave("aabcc", "dbbca", "aadbbbbaccc"));
    }

    @Test
    void t3() {
        Assertions.assertTrue(solution.isInterleave("", "", ""));
    }
}
