package com.raphael.lc.p81;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-16 19:05:24
 */
class SearchTest {

    private final Search solution = new Search();

    @Test
    void t1() {
        int[] nums = new int[]{2, 5, 6, 0, 0, 1, 2};
        Assertions.assertTrue(solution.search(nums, 0));
    }

    @Test
    void t2() {
        int[] nums = new int[]{2, 2, 2, 2, 0, 2, 2};
        Assertions.assertTrue(solution.search(nums, 0));
    }
}
