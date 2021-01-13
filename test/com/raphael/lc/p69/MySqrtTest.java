package com.raphael.lc.p69;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-13 11:25:39
 */
class MySqrtTest {

    private final MySqrt solution = new MySqrt();

    @Test
    void t1() {
        Assertions.assertEquals(2, solution.mySqrt(4));
    }

    @Test
    void t2() {
        Assertions.assertEquals(2, solution.mySqrt(8));
    }

    @Test
    void t3() {
        Assertions.assertEquals(1, solution.mySqrt(1));
    }

    @Test
    void t4() {
        Assertions.assertEquals(3, solution.mySqrt(9));
    }

    @Test
    void t5() {
        Assertions.assertEquals(3, solution.mySqrt(10));
    }

    @Test
    void t6() {
        Assertions.assertEquals(46339, solution.mySqrt(2147395599));
    }
}
