package com.raphael.lc.weekly236.p5727;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-11 10:40:25
 */
class FindTheWinnerTest {

    private final FindTheWinner solution = new FindTheWinner();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.findTheWinner(5, 2));
    }

    @Test
    void t2() {
        Assertions.assertEquals(1, solution.findTheWinner(6, 5));
    }

    @Test
    void t3() {
        Assertions.assertEquals(1, solution.findTheWinner(1, 1));
    }

    @Test
    void t4() {
        Assertions.assertEquals(4, solution.findTheWinner(5, 3));
    }
}
