package com.raphael.lc.p78;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-13 14:22:52
 */
class SubsetsTest {

    private final Subsets solution = new Subsets();

    @Test
    void t1() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(Collections.singletonList(1));
        ans.add(Collections.singletonList(2));
        ans.add(Collections.singletonList(3));
        ans.add(Arrays.asList(1, 2));
        ans.add(Arrays.asList(1, 3));
        ans.add(Arrays.asList(2, 3));
        ans.add(Arrays.asList(1, 2, 3));
        Assertions.assertEquals(ans, solution.subsets(nums));
    }
}
