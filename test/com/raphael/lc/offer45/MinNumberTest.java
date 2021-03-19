package com.raphael.lc.offer45;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-19 13:44:30
 */
class MinNumberTest {

    private final MinNumber solution = new MinNumber();

    @Test
    void t1() {
        int[] nums = {10, 2};
        Assertions.assertEquals("102", solution.minNumber(nums));
    }

    @Test
    void t2() {
        int[] nums = {3, 30, 34, 5, 9};
        Assertions.assertEquals("3033459", solution.minNumber(nums));
    }
}
