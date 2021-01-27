package com.raphael.lc.p46;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-27 21:15:14
 */
class PermuteTest {

    private final Permute solution = new Permute();

    @Test
    void t1() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(1, 2, 3));
        ans.add(Arrays.asList(1, 3, 2));
        ans.add(Arrays.asList(2, 1, 3));
        ans.add(Arrays.asList(2, 3, 1));
        ans.add(Arrays.asList(3, 2, 1));
        ans.add(Arrays.asList(3, 1, 2));
        Assertions.assertEquals(ans, solution.permute(nums));
    }
}
