package com.raphael.lc.p1221;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-19 12:21:26
 */
class BalancedStringSplitTest {

    private final BalancedStringSplit solution = new BalancedStringSplit();

    @Test
    void t1() {
        Assertions.assertEquals(4, solution.balancedStringSplit("RLRRLLRLRL"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(3, solution.balancedStringSplit("RLLLLRRRLR"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(1, solution.balancedStringSplit("LLLLRRRR"));
    }

    @Test
    void t4() {
        Assertions.assertEquals(2, solution.balancedStringSplit("RLRRRLLRLL"));
    }
}
