package com.raphael.lc.p682;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-25 12:29:23
 */
class CalPointsTest {

    private final CalPoints solution = new CalPoints();

    @Test
    void t1() {
        String[] ops = {"5", "2", "C", "D", "+"};
        Assertions.assertEquals(30, solution.calPoints(ops));
    }

    @Test
    void t2() {
        String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        Assertions.assertEquals(27, solution.calPoints(ops));
    }

    @Test
    void t3() {
        String[] ops = {"1"};
        Assertions.assertEquals(1, solution.calPoints(ops));
    }
}
