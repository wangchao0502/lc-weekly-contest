package com.raphael.lc.p1190;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-31 13:56:31
 */
class ReverseParenthesesTest {

    private final ReverseParentheses solution = new ReverseParentheses();

    @Test
    void t1() {
        Assertions.assertEquals("dcba", solution.reverseParentheses("(abcd)"));
    }

    @Test
    void t2() {
        Assertions.assertEquals("iloveu", solution.reverseParentheses("(u(love)i)"));
    }

    @Test
    void t3() {
        Assertions.assertEquals("leetcode", solution.reverseParentheses("(ed(et(oc))el)"));
    }

    @Test
    void t4() {
        Assertions.assertEquals("apmnolkjihgfedcbq", solution.reverseParentheses("a(bcdefghijkl(mno)p)q"));
    }
}
