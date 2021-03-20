package com.raphael.lc.p150;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-20 10:53:23
 */
class EvalRPNTest {

    private final EvalRPN solution = new EvalRPN();

    @Test
    void t1() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        Assertions.assertEquals(9, solution.evalRPN(tokens));
    }

    @Test
    void t2() {
        String[] tokens = {"4", "13", "5", "/", "+"};
        Assertions.assertEquals(6, solution.evalRPN(tokens));
    }
}
