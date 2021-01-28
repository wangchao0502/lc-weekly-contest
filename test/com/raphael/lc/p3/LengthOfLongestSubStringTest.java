package com.raphael.lc.p3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-28 22:15:40
 */
class LengthOfLongestSubStringTest {

    private final LengthOfLongestSubString solution = new LengthOfLongestSubString();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.lengthOfLongestSubString("abcabcbb"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(1, solution.lengthOfLongestSubString("bbbbb"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(3, solution.lengthOfLongestSubString("pwwkew"));
    }

    @Test
    void t4() {
        Assertions.assertEquals(0, solution.lengthOfLongestSubString(""));
    }

    @Test
    void t5() {
        Assertions.assertEquals(2, solution.lengthOfLongestSubString("abba"));
    }
}
