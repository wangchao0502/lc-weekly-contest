package com.raphael.lc.p1442;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-18 11:42:38
 */
class CountTripletsTest {

    private final CountTriplets solution = new CountTriplets();

    @Test
    void t1() {
        int[] arr = {2, 3, 1, 6, 7};
        Assertions.assertEquals(4, solution.countTriplets(arr));
    }

    @Test
    void t2() {
        int[] arr = {1, 1, 1, 1, 1};
        Assertions.assertEquals(10, solution.countTriplets(arr));
    }
}
