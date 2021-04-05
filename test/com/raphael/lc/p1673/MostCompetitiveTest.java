package com.raphael.lc.p1673;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-05 10:54:24
 */
class MostCompetitiveTest {

    private final MostCompetitive solution = new MostCompetitive();

    @Test
    void t1() {
        int[] nums = {3, 5, 2, 6};
        int[] result = {2, 6};
        Assertions.assertArrayEquals(result, solution.mostCompetitive(nums, 2));
    }

    @Test
    void t2() {
        int[] nums = {2, 4, 3, 3, 5, 4, 9, 6};
        int[] result = {2, 3, 3, 4};
        Assertions.assertArrayEquals(result, solution.mostCompetitive(nums, 4));
    }
}
