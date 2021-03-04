package com.raphael.lc.p354;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-04 09:51:28
 */
class MaxEnvelopesTest {

    private final MaxEnvelopes solution = new MaxEnvelopes();

    @Test
    void t1() {
        int[][] envelopes = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        Assertions.assertEquals(3, solution.maxEnvelopes(envelopes));
    }
}
