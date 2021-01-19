package com.raphael.lc.p32;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-19 21:40:59
 */
class LongestValidParenthesesTest {

    private final LongestValidParentheses solution = new LongestValidParentheses();

    @Test
    void t1() {
        Assertions.assertEquals(4, solution.longestValidParentheses(")()())"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(0, solution.longestValidParentheses(""));
    }

    @Test
    void t3() {
        Assertions.assertEquals(6, solution.longestValidParentheses("(()())"));
    }

    @Test
    void t4() {
        Assertions.assertEquals(2, solution.longestValidParentheses("()(()"));
    }

    @Test
    void t5() {
        Assertions.assertEquals(6, solution.longestValidParentheses("()(())"));
    }
}
