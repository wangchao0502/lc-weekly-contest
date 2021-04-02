package com.raphael.lc.p1410;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-02 11:53:41
 */
class EntityParserTest {

    private final EntityParser solution = new EntityParser();

    @Test
    void t1() {
        Assertions.assertEquals("& is an HTML entity but &ambassador; is not.", solution.entityParser("&amp; is an HTML entity but &ambassador; is not."));
    }

    @Test
    void t2() {
        Assertions.assertEquals("and I quote: \"...\"", solution.entityParser("and I quote: &quot;...&quot;"));
    }

    @Test
    void t3() {
        Assertions.assertEquals("Stay home! Practice on Leetcode :)", solution.entityParser("Stay home! Practice on Leetcode :)"));
    }

    @Test
    void t4() {
        Assertions.assertEquals("x > y && x < y is always false", solution.entityParser("x &gt; y &amp;&amp; x &lt; y is always false"));
    }

    @Test
    void t5() {
        Assertions.assertEquals("leetcode.com/problemset/all", solution.entityParser("leetcode.com&frasl;problemset&frasl;all"));
    }

    @Test
    void t6() {
        Assertions.assertEquals("&amp;amp;gt;", solution.entityParser("&amp;amp;amp;gt;"));
    }
}
