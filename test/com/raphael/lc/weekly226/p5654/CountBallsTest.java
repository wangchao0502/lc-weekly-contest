package com.raphael.lc.weekly226.p5654;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-31 10:31:47
 */
class CountBallsTest {

    private final CountBalls solution = new CountBalls();

    @Test
    void t1() {
        Assertions.assertEquals(2, solution.countBalls(1, 10));
    }

    @Test
    void t2() {
        Assertions.assertEquals(2, solution.countBalls(5, 15));
    }

    @Test
    void t3() {
        Assertions.assertEquals(2, solution.countBalls(19, 28));
    }
}
