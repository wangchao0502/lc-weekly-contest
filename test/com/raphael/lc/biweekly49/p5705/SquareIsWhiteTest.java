package com.raphael.lc.biweekly49.p5705;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-03 22:47:54
 */
class SquareIsWhiteTest {

    private final SquareIsWhite solution = new SquareIsWhite();

    @Test
    void t1() {
        Assertions.assertFalse(solution.squareIsWhite("a1"));
    }

    @Test
    void t2() {
        Assertions.assertTrue(solution.squareIsWhite("h3"));
    }

    @Test
    void t3() {
        Assertions.assertFalse(solution.squareIsWhite("c7"));
    }
}
