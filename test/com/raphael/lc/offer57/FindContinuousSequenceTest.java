package com.raphael.lc.offer57;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-22 12:18:49
 */
class FindContinuousSequenceTest {

    private final FindContinuousSequence solution = new FindContinuousSequence();

    @Test
    void t1() {
        int[][] result = {{2, 3, 4}, {4, 5}};
        Assertions.assertArrayEquals(result, solution.findContinuousSequence(9));
    }

    @Test
    void t2() {
        int[][] result = {{1, 2, 3, 4, 5}, {4, 5, 6}, {7, 8}};
        Assertions.assertArrayEquals(result, solution.findContinuousSequence(15));
    }
}
