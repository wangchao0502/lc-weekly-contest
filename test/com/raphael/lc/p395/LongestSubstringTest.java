package com.raphael.lc.p395;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-03 22:23:57
 */
class LongestSubstringTest {

    private final LongestSubstring solution = new LongestSubstring();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.longestSubstring("aaabb", 3));
    }
}
