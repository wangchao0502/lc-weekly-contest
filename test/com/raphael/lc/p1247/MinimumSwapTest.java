package com.raphael.lc.p1247;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-19 13:02:43
 */
class MinimumSwapTest {

    private final MinimumSwap solution = new MinimumSwap();

    @Test
    void t1() {
        Assertions.assertEquals(1, solution.minimumSwap("xx", "yy"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(2, solution.minimumSwap("xy", "yx"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(-1, solution.minimumSwap("xx", "xy"));
    }

    @Test
    void t4() {
        Assertions.assertEquals(4, solution.minimumSwap("xxyyxyxyxx", "xyyxyxxxyx"));
    }

    @Test
    void t5() {
        Assertions.assertEquals(4, solution.minimumSwap("yxyxxxyyxxyxxxx", "yyyxyyyxyxxxyxy"));
    }
}
