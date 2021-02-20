package com.raphael.lc.p162;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-19 18:38:02
 */
class FindPeakElementTest {

    private final FindPeakElement solution = new FindPeakElement();

    @Test
    void t1() {
        int[] nums = {1, 2, 3, 1};
        Assertions.assertEquals(2, solution.findPeakElement(nums));
    }

    @Test
    void t2() {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        Assertions.assertEquals(5, solution.findPeakElement(nums));
    }
}
