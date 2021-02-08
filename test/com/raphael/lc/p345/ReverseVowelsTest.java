package com.raphael.lc.p345;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-07 21:44:32
 */
class ReverseVowelsTest {

    private final ReverseVowels solution = new ReverseVowels();

    @Test
    void t1() {
        Assertions.assertEquals("holle", solution.reverseVowels("hello"));
    }

    @Test
    void t2() {
        Assertions.assertEquals("leetcode", solution.reverseVowels("leotcede"));
    }
}
