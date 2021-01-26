package com.raphael.lc.p1128;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-26 20:28:46
 */
class NumEquivDominoPairsTest {

    private final NumEquivDominoPairs solution = new NumEquivDominoPairs();

    @Test
    void t1() {
        int[][] dominoes = {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
        Assertions.assertEquals(1, solution.numEquivDominoPairs(dominoes));
    }
}
