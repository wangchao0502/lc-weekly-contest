package com.raphael.lc.p274;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-22 11:37:40
 */
class HIndexTest {

    private final HIndex solution = new HIndex();

    @Test
    void t1() {
        int[] citations = {3, 0, 6, 1, 5};
        Assertions.assertEquals(3, solution.hIndex(citations));
    }

    @Test
    void t2() {
        int[] citations = {0, 0, 1, 2, 1, 1, 10};
        Assertions.assertEquals(2, solution.hIndex(citations));
    }

    @Test
    void t3() {
        int[] citations = {0, 0, 1, 1, 1, 1, 10};
        Assertions.assertEquals(1, solution.hIndex(citations));
    }
}
