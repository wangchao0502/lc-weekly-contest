package com.raphael.lc.offer53;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-20 21:51:49
 */
class SearchTest {

    private final Search solution = new Search();

    @Test
    void t1() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        Assertions.assertEquals(2, solution.search(nums, 8));
    }

    @Test
    void t2() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        Assertions.assertEquals(0, solution.search(nums, 6));
    }
}
