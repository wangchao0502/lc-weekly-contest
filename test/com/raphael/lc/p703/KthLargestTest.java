package com.raphael.lc.p703;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-11 10:15:26
 */
class KthLargestTest {

    @Test
    void t1() {
        KthLargest obj = new KthLargest(3, new int[]{4,5,8,2});
        Assertions.assertEquals(4, obj.add(3));
        Assertions.assertEquals(5, obj.add(5));
        Assertions.assertEquals(5, obj.add(10));
        Assertions.assertEquals(8, obj.add(9));
        Assertions.assertEquals(8, obj.add(4));
    }
}
