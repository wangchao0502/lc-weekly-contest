package com.raphael.lc.p1081;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-30 16:26:34
 */
class SmallestSubsequenceTest {

    private final SmallestSubsequence solution = new SmallestSubsequence();

    @Test
    void t1() {
        Assertions.assertEquals("abc", solution.smallestSubsequence("bcabc"));
    }

    @Test
    void t2() {
        Assertions.assertEquals("acdb", solution.smallestSubsequence("cbacdcbc"));
    }

    @Test
    void t3() {
        Assertions.assertEquals("ab", solution.smallestSubsequence("baababaaaaababbbbbbaababaababa"));
    }

    @Test
    void t4() {
        Assertions.assertEquals("bca", solution.smallestSubsequence("bcbcbcababa"));
    }

    @Test
    void t5() {
        Assertions.assertEquals("abc", solution.smallestSubsequence("cbaacabcaaccaacababa"));
    }
}
