package com.raphael.lc.p674;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-24 12:55:03
 */
class FindLengthOfLCISTest {

    private final FindLengthOfLCIS solution = new FindLengthOfLCIS();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
    }

    @Test
    void t2() {
        Assertions.assertEquals(1, solution.findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
    }
}
