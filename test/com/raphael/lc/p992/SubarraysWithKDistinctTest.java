package com.raphael.lc.p992;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-09 10:27:15
 */
class SubarraysWithKDistinctTest {

    private final SubarraysWithKDistinct solution = new SubarraysWithKDistinct();

    @Test
    void t1() {
        int[] A = {1, 2, 1, 2, 3};
        Assertions.assertEquals(7, solution.subarraysWithKDistinct(A, 2));
    }

    @Test
    void t2() {
        int[] A = {1, 2, 1, 3, 4};
        Assertions.assertEquals(3, solution.subarraysWithKDistinct(A, 3));
    }
}
