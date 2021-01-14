package com.raphael.lc.p38;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-14 19:43:27
 */
class CountAndSayTest {

    private final CountAndSay solution = new CountAndSay();

    @Test
    void t1() {
        Assertions.assertEquals("1211", solution.countAndSay(4));
    }

    @Test
    void t2() {
        Assertions.assertEquals("1", solution.countAndSay(1));
    }
}
