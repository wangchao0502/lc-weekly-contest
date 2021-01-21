package com.raphael.lc.p1489;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-21 22:58:53
 */
class FindCriticalAndPseudoCriticalEdgesTest {

    private final FindCriticalAndPseudoCriticalEdges solution = new FindCriticalAndPseudoCriticalEdges();

    @Test
    void t1() {
        int[][] edges = {{0, 1, 1}, {1, 2, 1}, {2, 3, 2}, {0, 3, 2}, {0, 4, 3}, {3, 4, 3}, {1, 4, 6}};
        List<List<Integer>> result = solution.findCriticalAndPseudoCriticalEdges(5, edges);
        List<List<Integer>> except = new ArrayList<>();
        except.add(Arrays.asList(0, 1));
        except.add(Arrays.asList(2, 3, 4, 5));
        Assertions.assertEquals(except, result);
    }
}
