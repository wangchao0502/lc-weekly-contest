package com.raphael.lc.p1703;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-07 11:16:53
 */
class MinMovesTest {

    private final MinMoves solution = new MinMoves();

    @Test
    void t1() {
        int[] nums = {1, 0, 0, 1, 0, 1};
        Assertions.assertEquals(1, solution.minMoves(nums, 2));
    }

    @Test
    void t2() {
        int[] nums = {1, 0, 0, 0, 0, 0, 1, 1};
        Assertions.assertEquals(5, solution.minMoves(nums, 3));
    }

    @Test
    void t3() {
        int[] nums = {1, 1, 0, 1};
        Assertions.assertEquals(0, solution.minMoves(nums, 2));
    }
}
