package com.raphael.lc.p946;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-29 18:14:59
 */
class ValidateStackSequencesTest {

    private final ValidateStackSequences solution = new ValidateStackSequences();

    @Test
    void t1() {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};
        Assertions.assertTrue(solution.validateStackSequences(pushed, popped));
    }

    @Test
    void t2() {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 3, 5, 1, 2};
        Assertions.assertFalse(solution.validateStackSequences(pushed, popped));
    }
}
