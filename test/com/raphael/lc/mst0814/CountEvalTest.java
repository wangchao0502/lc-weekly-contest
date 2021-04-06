package com.raphael.lc.mst0814;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-06 10:59:24
 */
class CountEvalTest {

    private final CountEval solution = new CountEval();

    @Test
    void t1() {
        Assertions.assertEquals(2, solution.countEval("1^0|0|1", 0));
    }

    @Test
    void t2() {
        Assertions.assertEquals(10, solution.countEval("0&0&0&1^1|0", 1));
    }
}
