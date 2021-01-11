package com.raphael.lc.weekly223.p1723;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-10 11:07:57
 */
class MinimumTimeRequiredTest {

    private final MinimumTimeRequired solution = new MinimumTimeRequired();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.minimumTimeRequired(new int[]{3, 2, 3}, 3));
    }

    @Test
    void t2() {
        int[] jobs = {1, 2, 4, 7, 8};
        Assertions.assertEquals(11, solution.minimumTimeRequired(jobs, 2));
    }
}
