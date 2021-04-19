package com.raphael.lc.p757;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-19 11:12:45
 */
class IntersectionSizeTwoTest {

    private final IntersectionSizeTwo solution = new IntersectionSizeTwo();

    @Test
    void t1() {
        int[][] intervals = {{1, 3}, {1, 4}, {2, 5}, {3, 5}};
        Assertions.assertEquals(3, solution.intersectionSizeTwo(intervals));
    }

    @Test
    void t2() {
        int[][] intervals = {{1, 2}, {2, 3}, {2, 4}, {4, 5}};
        Assertions.assertEquals(5, solution.intersectionSizeTwo(intervals));
    }
}
