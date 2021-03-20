package com.raphael.lc.offer51;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-20 21:20:32
 */
class ReversePairsTest {

    private final ReversePairs solution = new ReversePairs();

    @Test
    void t1() {
        int[] nums = {7, 5, 6, 4};
        Assertions.assertEquals(5, solution.reversePairs(nums));
    }
}
