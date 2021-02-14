package com.raphael.lc.weekly228.p5678;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-14 10:41:50
 */
class MinimumSizeTest {

    private final MinimumSize solution = new MinimumSize();

    @Test
    void t1() {
        int[] nums = {2, 4, 8, 2};
        Assertions.assertEquals(2, solution.minimumSize(nums, 4));
    }

    @Test
    void t2() {
        int[] nums = {431, 922, 158, 60, 192, 14, 788, 146, 788, 775, 772, 792, 68, 143, 376, 375, 877, 516, 595, 82, 56, 704, 160, 403, 713, 504, 67, 332, 26};
        Assertions.assertEquals(129, solution.minimumSize(nums, 80));
    }
}
