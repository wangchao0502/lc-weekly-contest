package com.raphael.lc.lcp01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-16 15:01:54
 */
class GameTest {

    private final Game solution = new Game();

    @Test
    void t1() {
        int[] guess = {1, 2, 3};
        int[] answer = {1, 2, 3};
        Assertions.assertEquals(3, solution.game(guess, answer));
    }

    @Test
    void t2() {
        int[] guess = {2, 2, 3};
        int[] answer = {3, 2, 1};
        Assertions.assertEquals(1, solution.game(guess, answer));
    }
}
