package com.raphael.lc.weekly235.p5725;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-04 11:00:21
 */
class CountDifferentSubsequenceGCDsTest {

    private final CountDifferentSubsequenceGCDs solution = new CountDifferentSubsequenceGCDs();

    @Test
    void t1() {
        int[] nums = {6, 10, 3};
        Assertions.assertEquals(5, solution.countDifferentSubsequenceGCDs(nums));
    }

    @Test
    void t2() {
        int[] nums = {5, 15, 40, 5, 6};
        Assertions.assertEquals(7, solution.countDifferentSubsequenceGCDs(nums));
    }
}
