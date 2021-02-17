package com.raphael.lc.p216;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-17 13:49:11
 */
class CombinationSum3Test {

    private final CombinationSum3 solution = new CombinationSum3();

    @Test
    void t1() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1, 2, 4));
        Assertions.assertEquals(result, solution.combinationSum3(3, 7));
    }

    @Test
    void t2() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1, 2, 6));
        result.add(Arrays.asList(1, 3, 5));
        result.add(Arrays.asList(2, 3, 4));
        Assertions.assertEquals(result, solution.combinationSum3(3, 9));
    }
}
