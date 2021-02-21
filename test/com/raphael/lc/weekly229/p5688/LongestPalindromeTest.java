package com.raphael.lc.weekly229.p5688;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-21 12:28:24
 */
class LongestPalindromeTest {

    private final LongestPalindrome solution = new LongestPalindrome();

    @Test
    void t1() {
        Assertions.assertEquals(5, solution.longestPalindrome("cacb", "cbba"));
    }
}
