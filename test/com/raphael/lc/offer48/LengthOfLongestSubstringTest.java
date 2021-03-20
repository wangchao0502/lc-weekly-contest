package com.raphael.lc.offer48;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-20 12:07:53
 */
class LengthOfLongestSubstringTest {

    private final LengthOfLongestSubstring solution = new LengthOfLongestSubstring();

    @Test
    void t1() {
        String s = "abcabcbb";
        Assertions.assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void t2() {
        String s = "bbbbb";
        Assertions.assertEquals(1, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void t3() {
        String s = "pwwkew";
        Assertions.assertEquals(3, solution.lengthOfLongestSubstring(s));
    }
}
