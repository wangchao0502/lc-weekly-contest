package com.raphael.lc.p1423;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-06 20:23:49
 */
class MaxScoreTest {

    private final MaxScore solution = new MaxScore();

    @Test
    void t1() {
        int[] cards = {1, 2, 3, 4, 5, 6, 1};
        Assertions.assertEquals(12, solution.maxScore(cards, 3));
    }

    @Test
    void t2() {
        int[] cards = {2, 2, 2};
        Assertions.assertEquals(4, solution.maxScore(cards, 2));
    }

    @Test
    void t3() {
        int[] cards = {1, 1000, 1};
        Assertions.assertEquals(1, solution.maxScore(cards, 1));
    }
}
