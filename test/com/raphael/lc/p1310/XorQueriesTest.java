package com.raphael.lc.p1310;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-12 15:06:08
 */
class XorQueriesTest {

    private final XorQueries solution = new XorQueries();

    @Test
    void t1() {
        int[] arr = {1, 3, 4, 8};
        int[][] queries = {{0, 1}, {1, 2}, {0, 3}, {3, 3}};
        int[] ans = {2, 7, 14, 8};
        Assertions.assertArrayEquals(ans, solution.xorQueries(arr, queries));
    }

    @Test
    void t2() {
        int[] arr = {4, 8, 2, 10};
        int[][] queries = {{2, 3}, {1, 3}, {0, 0}, {0, 3}};
        int[] ans = {8, 0, 4, 4};
        Assertions.assertArrayEquals(ans, solution.xorQueries(arr, queries));
    }

    @Test
    void t3() {
        int[] arr = {16};
        int[][] queries = {{0, 0}, {0, 0}, {0, 0}};
        int[] ans = {16, 16, 16};
        Assertions.assertArrayEquals(ans, solution.xorQueries(arr, queries));
    }
}
