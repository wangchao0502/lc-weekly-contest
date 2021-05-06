package com.raphael.lc.p417;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-06 14:31:41
 */
class PacificAtlanticTest {

    private final PacificAtlantic solution = new PacificAtlantic();

    @Test
    void t1() {
        int[][] heights = {{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(0, 4));
        ans.add(Arrays.asList(1, 3));
        ans.add(Arrays.asList(1, 4));
        ans.add(Arrays.asList(2, 2));
        ans.add(Arrays.asList(3, 0));
        ans.add(Arrays.asList(3, 1));
        ans.add(Arrays.asList(4, 0));
        Assertions.assertEquals(ans, solution.pacificAtlantic(heights));
    }
}
