package com.raphael.lc.p115;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-17 09:55:59
 */
class NumDistinctTest {

    private final NumDistinct solution = new NumDistinct();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.numDistinct("rabbbit", "rabbit"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(5, solution.numDistinct("babgbag", "bag"));
    }
}
