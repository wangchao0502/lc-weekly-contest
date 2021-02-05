package com.raphael.lc.p125;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-05 10:22:36
 */
class IsPalindromeTest {

    private final IsPalindrome solution = new IsPalindrome();

    @Test
    void t1() {
        String input = "A man, a plan, a canal: Panama";
        Assertions.assertTrue(solution.isPalindrome(input));
    }

    @Test
    void t2() {
        String input = "race a car";
        Assertions.assertFalse(solution.isPalindrome(input));
    }

    @Test
    void t3() {
        Assertions.assertFalse(solution.isPalindrome("OP"));
    }
}
