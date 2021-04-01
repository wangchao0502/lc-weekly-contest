package com.raphael.lc.p1249;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-01 12:20:14
 */
class MinRemoveToMakeValidTest {

    private final MinRemoveToMakeValid solution = new MinRemoveToMakeValid();

    @Test
    void t1() {
        Assertions.assertEquals("lee(t(c)o)de", solution.minRemoveToMakeValid("lee(t(c)o)de)"));
    }

    @Test
    void t2() {
        Assertions.assertEquals("ab(c)d", solution.minRemoveToMakeValid("a)b(c)d"));
    }

    @Test
    void t3() {
        Assertions.assertEquals("", solution.minRemoveToMakeValid("))(("));
    }

    @Test
    void t4() {
        Assertions.assertEquals("a(b(c)d)", solution.minRemoveToMakeValid("(a(b(c)d)"));
    }
}
