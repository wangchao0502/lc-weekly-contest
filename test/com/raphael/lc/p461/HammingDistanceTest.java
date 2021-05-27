package com.raphael.lc.p461;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-27 12:26:12
 */
class HammingDistanceTest {

    private final HammingDistance solution = new HammingDistance();

    @Test
    void t1() {
        Assertions.assertEquals(2, solution.hammingDistance(1, 4));
    }
}
