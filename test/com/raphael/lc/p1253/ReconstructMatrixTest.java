package com.raphael.lc.p1253;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-04-20 15:46:22
 */
class ReconstructMatrixTest {

    private final ReconstructMatrix solution = new ReconstructMatrix();

    @Test
    void t1() {
        int[] colsum = {1, 1, 1};
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(1, 1, 0));
        ans.add(Arrays.asList(0, 0, 1));
        Assertions.assertEquals(ans, solution.reconstructMatrix(2, 1, colsum));
    }

    @Test
    void t2() {
        int[] colsum = {2, 2, 1, 1};
        List<List<Integer>> ans = new ArrayList<>();
        Assertions.assertEquals(ans, solution.reconstructMatrix(2, 3, colsum));
    }

    @Test
    void t3() {
        int[] colsum = {2, 1, 2, 0, 1, 0, 1, 2, 0, 1};
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(1, 1, 1, 0, 1, 0, 0, 1, 0, 0));
        ans.add(Arrays.asList(1, 0, 1, 0, 0, 0, 1, 1, 0, 1));
        Assertions.assertEquals(ans, solution.reconstructMatrix(5, 5, colsum));
    }
}
