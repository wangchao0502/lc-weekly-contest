package com.raphael.lc.p1143;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-03 12:50:49
 */
class LongestCommonSubsequenceTest {

    private final LongestCommonSubsequence solution = new LongestCommonSubsequence();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(3, solution.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(0, solution.longestCommonSubsequence("abc", "def"));
    }

    @Test
    void t4() {
        Assertions.assertEquals(3, solution.longestCommonSubsequence("ace", "abcde"));
    }

    @Test
    void t5() {
        Assertions.assertEquals(2, solution.longestCommonSubsequence("ezupkr", "ubmrapg"));
    }
}
