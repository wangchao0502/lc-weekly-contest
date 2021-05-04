package com.raphael.lc.p301;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-04 14:34:18
 */
class RemoveInvalidParenthesesTest {

    private final RemoveInvalidParentheses solution = new RemoveInvalidParentheses();

    @Test
    void t1() {
        List<String> ans = new ArrayList<>();
        ans.add("()()()");
        ans.add("(())()");
        Assertions.assertEquals(ans, solution.removeInvalidParentheses("()())()"));
    }

    @Test
    void t2() {
        List<String> ans = new ArrayList<>();
        ans.add("(a)()()");
        ans.add("(a())()");
        Assertions.assertEquals(ans, solution.removeInvalidParentheses("(a)())()"));
    }
}
