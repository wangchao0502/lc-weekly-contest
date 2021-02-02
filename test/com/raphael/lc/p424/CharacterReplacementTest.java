package com.raphael.lc.p424;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-02 10:14:38
 */
class CharacterReplacementTest {

    private final CharacterReplacement solution = new CharacterReplacement();

    @Test
    void t1() {
        Assertions.assertEquals(4, solution.characterReplacement("ABAB", 2));
    }

    @Test
    void t2() {
        Assertions.assertEquals(4, solution.characterReplacement("AABABBA", 1));
    }
}
