package com.raphael.lc.p901;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-26 11:45:13
 */
class StockSpannerTest {
    @Test
    void t1() {
        StockSpanner obj = new StockSpanner();
        Assertions.assertEquals(1, obj.next(100));
        Assertions.assertEquals(1, obj.next(80));
        Assertions.assertEquals(1, obj.next(60));
        Assertions.assertEquals(2, obj.next(70));
        Assertions.assertEquals(1, obj.next(60));
        Assertions.assertEquals(4, obj.next(75));
        Assertions.assertEquals(6, obj.next(85));
    }

    @Test
    void t2() {
        StockSpanner obj = new StockSpanner();
        Assertions.assertEquals(1, obj.next(31));
        Assertions.assertEquals(2, obj.next(41));
        Assertions.assertEquals(3, obj.next(48));
        Assertions.assertEquals(4, obj.next(59));
        Assertions.assertEquals(5, obj.next(79));
    }
}
