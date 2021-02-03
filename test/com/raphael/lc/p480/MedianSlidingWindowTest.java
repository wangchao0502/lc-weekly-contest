package com.raphael.lc.p480;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-03 11:03:03
 */
class MedianSlidingWindowTest {

    private final MedianSlidingWindow solution = new MedianSlidingWindow();

    @Test
    void t1() {
        int[] input = {1, 3, -1, -3, 5, 3, 6, 7};
        double[] output = {1, -1, -1, 3, 5, 6};
        Assertions.assertArrayEquals(output, solution.medianSlidingWindow(input, 3));
    }
}
