package com.raphael.lc.p477;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-28 13:39:33
 */
class TotalHammingDistanceTest {

    private final TotalHammingDistance solution = new TotalHammingDistance();

    @Test
    void t1() {
        int[] nums = {4, 14, 2};
        Assertions.assertEquals(6, solution.totalHammingDistance(nums));
    }
}
