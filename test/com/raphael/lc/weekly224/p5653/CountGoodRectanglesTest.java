package com.raphael.lc.weekly224.p5653;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-17 10:35:12
 */
class CountGoodRectanglesTest {

    private final CountGoodRectangles solution = new CountGoodRectangles();

    @Test
    void t1() {
        int[][] rectangles = {{5, 8}, {3, 9}, {5, 12}, {16, 5}};
        Assertions.assertEquals(3, solution.countGoodRectangles(rectangles));
    }
}
