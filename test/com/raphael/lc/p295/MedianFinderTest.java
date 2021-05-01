package com.raphael.lc.p295;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-01 13:04:55
 */
class MedianFinderTest {
    @Test
    void t1() {
        MedianFinder obj = new MedianFinder();
        obj.addNum(1);
        obj.addNum(2);
        Assertions.assertEquals(1.5, obj.findMedian());
        obj.addNum(3);
        Assertions.assertEquals(2, obj.findMedian());
    }
}
