package com.raphael.lc.offer03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-08 21:31:10
 */
class FindRepeatNumberTest {

    private final FindRepeatNumber solution = new FindRepeatNumber();

    @Test
    void t1() {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        Assertions.assertEquals(2, solution.findRepeatNumber(nums));
    }
}
