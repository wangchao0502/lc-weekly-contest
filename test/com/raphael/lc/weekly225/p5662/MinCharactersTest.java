package com.raphael.lc.weekly225.p5662;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-24 10:47:35
 */
class MinCharactersTest {

    private final MinCharacters solution = new MinCharacters();

    @Test
    void t1() {
        Assertions.assertEquals(2, solution.minCharacters("aba", "caa"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(3, solution.minCharacters("dabadd", "cda"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(1, solution.minCharacters("acac", "bd"));
    }

    @Test
    void t4() {
        Assertions.assertEquals(0, solution.minCharacters("dee", "a"));
    }

    @Test
    void t5() {
        Assertions.assertEquals(2, solution.minCharacters("ace", "abe"));
    }
}
