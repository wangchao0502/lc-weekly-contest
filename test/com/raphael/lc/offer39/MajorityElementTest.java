package com.raphael.lc.offer39;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-17 11:53:00
 */
class MajorityElementTest {

    private final MajorityElement solution = new MajorityElement();

    @Test
    void t1() {
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        Assertions.assertEquals(2, solution.majorityElement(nums));
    }
}
