package com.raphael.lc.p1389;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-24 12:12:05
 */
class CreateTargetArrayTest {

    private final CreateTargetArray solution = new CreateTargetArray();

    @Test
    void t1() {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] ans = {0, 4, 1, 3, 2};
        Assertions.assertArrayEquals(ans, solution.createTargetArray(nums, index));
    }

    @Test
    void t2() {
        int[] nums = {1, 2, 3, 4, 0};
        int[] index = {0, 1, 2, 3, 0};
        int[] ans = {0, 1, 2, 3, 4};
        Assertions.assertArrayEquals(ans, solution.createTargetArray(nums, index));
    }

    @Test
    void t3() {
        int[] nums = {1};
        int[] index = {0};
        int[] ans = {1};
        Assertions.assertArrayEquals(ans, solution.createTargetArray(nums, index));
    }
}
