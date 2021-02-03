package com.raphael.lc.p1281;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-03 23:34:04
 */
class SubtractProductAndSumTest {

    private final SubtractProductAndSum solution = new SubtractProductAndSum();

    @Test
    void t1() {
        Assertions.assertEquals(15, solution.subtractProductAndSum(234));
    }

    @Test
    void t2() {
        Assertions.assertEquals(21, solution.subtractProductAndSum(4421));
    }
}
