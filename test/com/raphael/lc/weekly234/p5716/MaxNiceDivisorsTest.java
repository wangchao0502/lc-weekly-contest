package com.raphael.lc.weekly234.p5716;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-28 11:00:28
 */
class MaxNiceDivisorsTest {

    private final MaxNiceDivisors solution = new MaxNiceDivisors();

    @Test
    void t1() {
        Assertions.assertEquals(6, solution.maxNiceDivisors(5));
    }

    @Test
    void t2() {
        Assertions.assertEquals(18, solution.maxNiceDivisors(8));
    }
}
