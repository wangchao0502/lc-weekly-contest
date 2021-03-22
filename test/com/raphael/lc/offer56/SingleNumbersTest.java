package com.raphael.lc.offer56;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-22 11:45:01
 */
class SingleNumbersTest {

    private final SingleNumbers solution = new SingleNumbers();

    @Test
    void t1() {
        int[] nums = {4, 1, 4, 6};
        int[] result = {1, 6};
        Assertions.assertArrayEquals(result, solution.singleNumbers(nums));
    }

    @Test
    void t2() {
        int[] nums = {1, 2, 10, 4, 1, 4, 3, 3};
        int[] result = {10, 2};
        Assertions.assertArrayEquals(result, solution.singleNumbers(nums));
    }
}
