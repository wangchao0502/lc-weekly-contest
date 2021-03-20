package com.raphael.lc.biweekly48.p5695;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-20 23:13:58
 */
class MaxScoreTest {

    private final MaxScore solution = new MaxScore();

    @Test
    void t1() {
        int[] nums = {1, 2};
        Assertions.assertEquals(1, solution.maxScore(nums));
    }

    @Test
    void t2() {
        int[] nums = {3, 4, 6, 8};
        Assertions.assertEquals(11, solution.maxScore(nums));
    }

    @Test
    void t3() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        Assertions.assertEquals(14, solution.maxScore(nums));
    }

    @Test
    void t4() {
        int[] nums = {171651, 546244, 880754, 412358};
        Assertions.assertEquals(60, solution.maxScore(nums));
    }

    @Test
    void t5() {
        int[] nums = {889509, 644676, 621999, 606262, 412720, 678593};
        Assertions.assertEquals(28, solution.maxScore(nums));
    }
}
