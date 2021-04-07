package com.raphael.lc.p347;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-07 12:12:42
 */
class TopKFrequentTest {

    private final TopKFrequent solution = new TopKFrequent();

    @Test
    void t1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] result = {1, 2};
        Assertions.assertArrayEquals(result, solution.topKFrequent(nums, 2));
    }

    @Test
    void t2() {
        int[] nums = {1};
        int[] result = {1};
        Assertions.assertArrayEquals(result, solution.topKFrequent(nums, 1));
    }
}
