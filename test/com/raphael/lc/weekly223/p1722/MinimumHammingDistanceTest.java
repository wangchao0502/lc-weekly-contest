package com.raphael.lc.weekly223.p1722;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-10 10:56:58
 */
class MinimumHammingDistanceTest {

    private final MinimumHammingDistance solution = new MinimumHammingDistance();

    @Test
    void t1() {
        int[] source = {1, 2, 3, 5};
        int[] target = {2, 1, 4, 3};
        int[][] allowedSwaps = {{0, 1}, {2, 3}};
        Assertions.assertEquals(1, solution.minimumHammingDistance(source, target, allowedSwaps));
    }
}
