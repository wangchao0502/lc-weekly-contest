package com.raphael.lc.biweekly50.p5719;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-17 23:21:14
 */
class GetMaximumXorTest {

    private final GetMaximumXor solution = new GetMaximumXor();

    @Test
    void t1() {
        int[] nums = {0, 1, 1, 3};
        int[] ans = {0, 3, 2, 3};
        Assertions.assertArrayEquals(ans, solution.getMaximumXor(nums, 2));
    }

    @Test
    void t2() {
        int[] nums = {2, 3, 4, 7};
        int[] ans = {5, 2, 6, 5};
        Assertions.assertArrayEquals(ans, solution.getMaximumXor(nums, 3));
    }

    @Test
    void t3() {
        int[] nums = {0, 1, 2, 2, 5, 7};
        int[] ans = {4, 3, 6, 4, 6, 7};
        Assertions.assertArrayEquals(ans, solution.getMaximumXor(nums, 3));
    }
}

