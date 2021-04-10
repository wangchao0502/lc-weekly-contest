package com.raphael.lc.p948;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-10 10:11:59
 */
class BagOfTokensScoreTest {

    private final BagOfTokensScore solution = new BagOfTokensScore();

    @Test
    void t1() {
        int[] tokens = {100};
        Assertions.assertEquals(0, solution.bagOfTokensScore(tokens, 50));
    }

    @Test
    void t2() {
        int[] tokens = {100, 200};
        Assertions.assertEquals(1, solution.bagOfTokensScore(tokens, 150));
    }

    @Test
    void t3() {
        int[] tokens = {100, 200, 300, 400};
        Assertions.assertEquals(2, solution.bagOfTokensScore(tokens, 200));
    }

    @Test
    void t4() {
        int[] tokens = {71, 55, 82};
        Assertions.assertEquals(0, solution.bagOfTokensScore(tokens, 54));
    }
}
