package com.raphael.lc.p665;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-07 09:37:01
 */
class CheckPossibilityTest {

    private final CheckPossibility solution = new CheckPossibility();

    @Test
    void t1() {
        int[] input = {4, 2, 1};
        Assertions.assertFalse(solution.checkPossibility(input));
    }

    @Test
    void t2() {
        int[] input = {4, 2, 3};
        Assertions.assertTrue(solution.checkPossibility(input));
    }

    @Test
    void t3() {
        int[] input = {2, 3, 3, 2, 2};
        Assertions.assertFalse(solution.checkPossibility(input));
    }
}
