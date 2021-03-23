package com.raphael.lc.p394;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-23 21:35:01
 */
class DecodeStringTest {

    private final DecodeString solution = new DecodeString();

    @Test
    void t1() {
        Assertions.assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
    }

    @Test
    void t2() {
        Assertions.assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
    }

    @Test
    void t3() {
        Assertions.assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
    }

    @Test
    void t4() {
        Assertions.assertEquals("abccdcdcdxyz", solution.decodeString("abc3[cd]xyz"));
    }

    @Test
    void t5() {
        Assertions.assertEquals("abcccbccc", solution.decodeString("a2[b3[c]]"));
    }
}
