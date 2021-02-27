package com.raphael.lc.p832;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-24 13:47:15
 */
class FlipAndInvertImageTest {

    private final FlipAndInvertImage solution = new FlipAndInvertImage();

    @Test
    void t1() {
        int[][] input = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] output = {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        Assertions.assertArrayEquals(output, solution.flipAndInvertImage(input));
    }
}
