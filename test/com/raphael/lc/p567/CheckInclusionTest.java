package com.raphael.lc.p567;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-10 10:08:45
 */
class CheckInclusionTest {

    private final CheckInclusion solution = new CheckInclusion();

    @Test
    void t1() {
        Assertions.assertTrue(solution.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    void t2() {
        Assertions.assertFalse(solution.checkInclusion("ab", "eidboaoo"));
    }
}
