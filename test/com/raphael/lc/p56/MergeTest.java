package com.raphael.lc.p56;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-11 11:16:46
 */
class MergeTest {

    private final Merge solution = new Merge();

    @Test
    void t1() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = {{1, 6}, {8, 10}, {15, 18}};
        Assertions.assertArrayEquals(result, solution.merge(intervals));
    }

    @Test
    void t2() {
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] result = {{1, 5}};
        Assertions.assertArrayEquals(result, solution.merge(intervals));
    }
}
