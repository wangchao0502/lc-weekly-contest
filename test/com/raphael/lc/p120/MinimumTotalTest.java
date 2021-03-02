package com.raphael.lc.p120;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-02-27 17:51:44
 */
class MinimumTotalTest {

    private final MinimumTotal solution = new MinimumTotal();

    @Test
    void t1() {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Collections.singletonList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        Assertions.assertEquals(11, solution.minimumTotal(triangle));
    }

    @Test
    void t2() {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Collections.singletonList(-10));
        Assertions.assertEquals(-10, solution.minimumTotal(triangle));
    }
}
