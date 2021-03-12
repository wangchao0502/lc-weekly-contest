package com.raphael.lc.offer13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-12 12:06:39
 */
class MovingCountTest {

    private final MovingCount solution = new MovingCount();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.movingCount(2, 3, 1));
    }
}
