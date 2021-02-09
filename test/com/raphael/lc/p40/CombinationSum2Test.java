package com.raphael.lc.p40;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-09 14:09:59
 */
class CombinationSum2Test {

    private final CombinationSum2 solution = new CombinationSum2();

    @Test
    void t1() {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1, 1, 6));
        result.add(Arrays.asList(1, 2, 5));
        result.add(Arrays.asList(1, 7));
        result.add(Arrays.asList(2, 6));
        Assertions.assertEquals(result, solution.combinationSum2(candidates, 8));
    }
}
