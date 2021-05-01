package com.raphael.lc.p218;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-01 12:39:12
 */
class GetSkylineTest {

    private final GetSkyline solution = new GetSkyline();

    @Test
    void t1() {
        int[][] buildings = {{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(2, 10));
        ans.add(Arrays.asList(3, 15));
        ans.add(Arrays.asList(7, 12));
        ans.add(Arrays.asList(12, 0));
        ans.add(Arrays.asList(15, 10));
        ans.add(Arrays.asList(20, 8));
        ans.add(Arrays.asList(24, 0));
        Assertions.assertEquals(ans, solution.getSkyline(buildings));
    }
}
