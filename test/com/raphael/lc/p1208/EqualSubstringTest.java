package com.raphael.lc.p1208;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-05 09:31:22
 */
class EqualSubstringTest {

    private final EqualSubstring solution = new EqualSubstring();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.equalSubstring("abcd", "bcdf", 3));
    }

    @Test
    void t2() {
        Assertions.assertEquals(1, solution.equalSubstring("abcd", "cdef", 3));
    }

    @Test
    void t3() {
        Assertions.assertEquals(3, solution.equalSubstring("abc", "bcd", 3));
    }
}
