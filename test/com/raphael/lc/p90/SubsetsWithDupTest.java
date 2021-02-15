package com.raphael.lc.p90;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-15 16:53:38
 */
class SubsetsWithDupTest {

    private final SubsetsWithDup solution = new SubsetsWithDup();

    @Test
    void t1() {
        int[] nums = {1, 2, 2};
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(Collections.singletonList(1));
        result.add(Arrays.asList(1, 2));
        result.add(Arrays.asList(1, 2, 2));
        result.add(Collections.singletonList(2));
        result.add(Arrays.asList(2, 2));
        Assertions.assertEquals(result, solution.subsetsWithDup(nums));
    }
}
