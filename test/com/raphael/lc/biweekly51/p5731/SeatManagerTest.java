package com.raphael.lc.biweekly51.p5731;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-01 23:00:22
 */
class SeatManagerTest {
    @Test
    void t1() {
        SeatManager obj = new SeatManager(5);
        Assertions.assertEquals(1, obj.reserve());
        Assertions.assertEquals(2, obj.reserve());
        obj.unreserve(2);
        Assertions.assertEquals(2, obj.reserve());
        Assertions.assertEquals(3, obj.reserve());
        Assertions.assertEquals(4, obj.reserve());
        Assertions.assertEquals(5, obj.reserve());
        obj.unreserve(5);
    }
}
