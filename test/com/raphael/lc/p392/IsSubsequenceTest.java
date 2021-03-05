package com.raphael.lc.p392;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-05 16:49:34
 */
class IsSubsequenceTest {

    private final IsSubsequence solution = new IsSubsequence();

    @Test
    void t1() {
        Assertions.assertTrue(solution.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void t2() {
        Assertions.assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }
}
