package com.raphael.lc.p1021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-30 14:37:57
 */
class RemoveOuterParenthesesTest {

    private final RemoveOuterParentheses solution = new RemoveOuterParentheses();

    @Test
    void t1() {
        Assertions.assertEquals("()()()", solution.removeOuterParentheses("(()())(())"));
    }

    @Test
    void t2() {
        Assertions.assertEquals("()()()()(())", solution.removeOuterParentheses("(()())(())(()(()))"));
    }

    @Test
    void t3() {
        Assertions.assertEquals("", solution.removeOuterParentheses("()()"));
    }
}
