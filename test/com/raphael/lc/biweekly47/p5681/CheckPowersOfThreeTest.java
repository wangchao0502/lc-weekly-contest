package com.raphael.lc.biweekly47.p5681;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-06 22:40:54
 */
class CheckPowersOfThreeTest {

    private final CheckPowersOfThree solution = new CheckPowersOfThree();

    @Test
    void t1() {
        Assertions.assertTrue(solution.checkPowersOfThree(12));
    }

    @Test
    void t2() {
        Assertions.assertTrue(solution.checkPowersOfThree(91));
    }

    @Test
    void t3() {
        Assertions.assertFalse(solution.checkPowersOfThree(21));
    }

    @Test
    void t4() {
        Assertions.assertTrue(solution.checkPowersOfThree(6378022));
    }
}
