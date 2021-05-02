package com.raphael.lc.weekly239.p5746;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-02 10:31:16
 */
class GetMinDistanceTest {

    private final GetMinDistance solution = new GetMinDistance();

    @Test
    void t1() {
        int[] nums = {1, 2, 3, 4, 5};
        Assertions.assertEquals(1, solution.getMinDistance(nums, 5, 3));
    }

    @Test
    void t2() {
        int[] nums = {1};
        Assertions.assertEquals(0, solution.getMinDistance(nums, 1, 0));
    }

    @Test
    void t3() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        Assertions.assertEquals(0, solution.getMinDistance(nums, 1, 0));
    }
}
