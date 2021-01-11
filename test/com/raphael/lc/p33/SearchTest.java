package com.raphael.lc.p33;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-11 17:44:22
 */
class SearchTest {

    private final Search solution = new Search();

    @Test
    void t1() {
        Assertions.assertEquals(4, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    void t2() {
        Assertions.assertEquals(-1, solution.search(new int[]{1}, 0));
    }

    @Test
    void t3() {
        Assertions.assertEquals(-1, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }

    @Test
    void t4() {
        Assertions.assertEquals(2, solution.search(new int[]{5, 1, 3}, 3));
    }
}
