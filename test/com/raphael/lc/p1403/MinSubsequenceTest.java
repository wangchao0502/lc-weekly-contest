package com.raphael.lc.p1403;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-04-20 16:14:45
 */
class MinSubsequenceTest {

    private final MinSubsequence solution = new MinSubsequence();

    @Test
    void t1() {
        int[] nums = {4, 3, 10, 9, 8};
        List<Integer> ans = Arrays.asList(10, 9);
        Assertions.assertEquals(ans, solution.minSubsequence(nums));
    }

    @Test
    void t2() {
        int[] nums = {4, 4, 7, 6, 7};
        List<Integer> ans = Arrays.asList(7, 7, 6);
        Assertions.assertEquals(ans, solution.minSubsequence(nums));
    }

    @Test
    void t3() {
        int[] nums = {6};
        List<Integer> ans = Collections.singletonList(6);
        Assertions.assertEquals(ans, solution.minSubsequence(nums));
    }
}
