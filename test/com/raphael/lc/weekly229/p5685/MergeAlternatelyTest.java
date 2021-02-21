package com.raphael.lc.weekly229.p5685;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-21 10:30:37
 */
class MergeAlternatelyTest {

    private final MergeAlternately solution = new MergeAlternately();

    @Test
    void t1() {
        Assertions.assertEquals("apbqcr", solution.mergeAlternately("abc", "pqr"));
    }

    @Test
    void t2() {
        Assertions.assertEquals("apbqrs", solution.mergeAlternately("ab", "pqrs"));
    }

    @Test
    void t3() {
        Assertions.assertEquals("apbqcd", solution.mergeAlternately("abcd", "pq"));
    }
}
