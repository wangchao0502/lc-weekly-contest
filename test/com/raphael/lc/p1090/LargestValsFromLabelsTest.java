package com.raphael.lc.p1090;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-15 12:03:56
 */
class LargestValsFromLabelsTest {

    private final LargestValsFromLabels solution = new LargestValsFromLabels();

    @Test
    void t1() {
        int[] values = {5, 4, 3, 2, 1};
        int[] labels = {1, 1, 2, 2, 3};
        Assertions.assertEquals(9, solution.largestValsFromLabels(values, labels, 3, 1));
    }

    @Test
    void t2() {
        int[] values = {5, 4, 3, 2, 1};
        int[] labels = {1, 3, 3, 3, 2};
        Assertions.assertEquals(12, solution.largestValsFromLabels(values, labels, 3, 2));
    }

    @Test
    void t3() {
        int[] values = {9, 8, 8, 7, 6};
        int[] labels = {0, 0, 0, 1, 1};
        Assertions.assertEquals(16, solution.largestValsFromLabels(values, labels, 3, 1));
    }

    @Test
    void t4() {
        int[] values = {9, 8, 8, 7, 6};
        int[] labels = {0, 0, 0, 1, 1};
        Assertions.assertEquals(24, solution.largestValsFromLabels(values, labels, 3, 2));
    }
}
