package com.raphael.lc.p1502;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-22 11:45:50
 */
class CanMakeArithmeticProgressionTest {

    private final CanMakeArithmeticProgression solution = new CanMakeArithmeticProgression();

    @Test
    void t1() {
        int[] arr = {3, 5, 1};
        Assertions.assertTrue(solution.canMakeArithmeticProgression(arr));
    }

    @Test
    void t2() {
        int[] arr = {1, 2, 4};
        Assertions.assertFalse(solution.canMakeArithmeticProgression(arr));
    }
}
