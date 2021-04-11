package com.raphael.lc.weekly236.p5729;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-11 11:39:08
 */
class MKAverageTest {
    @Test
    void t1() {
        MKAverage obj = new MKAverage(3, 1);
        obj.addElement(3);
        obj.addElement(1);
        Assertions.assertEquals(-1, obj.calculateMKAverage());
        obj.addElement(10);
        Assertions.assertEquals(3, obj.calculateMKAverage());
        obj.addElement(5);
        obj.addElement(5);
        obj.addElement(5);
        Assertions.assertEquals(5, obj.calculateMKAverage());
    }

    @Test
    void t2() {
        MKAverage obj = new MKAverage(3, 1);
        obj.addElement(4010);
        obj.addElement(2926);
        Assertions.assertEquals(-1, obj.calculateMKAverage());
        obj.addElement(3336);
        obj.addElement(85138);
        Assertions.assertEquals(3336, obj.calculateMKAverage());
        obj.addElement(70965);
        obj.addElement(1207);
        Assertions.assertEquals(70965, obj.calculateMKAverage());
        obj.addElement(49966);
    }
}
