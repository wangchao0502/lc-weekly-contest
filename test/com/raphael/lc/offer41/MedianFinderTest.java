package com.raphael.lc.offer41;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-18 17:34:04
 */
class MedianFinderTest {

    @Test
    void t1() {
        MedianFinder obj = new MedianFinder();
        obj.addNum(1);
        obj.addNum(2);
        Assertions.assertTrue(Math.abs(obj.findMedian() - 1.5d) < 0.001);
        obj.addNum(3);
        Assertions.assertTrue(Math.abs(obj.findMedian() - 2d) < 0.001);
    }
}
