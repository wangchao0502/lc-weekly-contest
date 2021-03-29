package com.raphael.lc.p1003;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-29 18:30:38
 */
class IsValidTest {

    private final IsValid solution = new IsValid();

    @Test
    void t1() {
        Assertions.assertTrue(solution.isValid("aabcbc"));
    }

    @Test
    void t2() {
        Assertions.assertTrue(solution.isValid("abcabcababcc"));
    }

    @Test
    void t3() {
        Assertions.assertFalse(solution.isValid("abccba"));
    }

    @Test
    void t4() {
        Assertions.assertFalse(solution.isValid("cababc"));
    }
}
