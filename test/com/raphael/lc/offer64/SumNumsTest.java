package com.raphael.lc.offer64;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-22 14:39:53
 */
class SumNumsTest {

    private final SumNums solution = new SumNums();

    @Test
    void t1() {
        Assertions.assertEquals(6, solution.sumNums(3));
    }

    @Test
    void t2() {
        Assertions.assertEquals(45, solution.sumNums(9));
    }
}
