package com.raphael.lc.p856;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-27 15:56:19
 */
class ScoreOfParenthesesTest {

    private final ScoreOfParentheses solution = new ScoreOfParentheses();

    @Test
    void t1() {
        Assertions.assertEquals(1, solution.scoreOfParentheses("()"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(2, solution.scoreOfParentheses("(())"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(2, solution.scoreOfParentheses("()()"));
    }

    @Test
    void t4() {
        Assertions.assertEquals(6, solution.scoreOfParentheses("(()(()))"));
    }
}
