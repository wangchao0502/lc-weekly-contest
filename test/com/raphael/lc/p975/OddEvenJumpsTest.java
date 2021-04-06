package com.raphael.lc.p975;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-06 12:13:59
 */
class OddEvenJumpsTest {

    private final OddEvenJumps solution = new OddEvenJumps();

    @Test
    void t1() {
        int[] arr = {10, 13, 12, 14, 15};
        Assertions.assertEquals(2, solution.oddEvenJumps(arr));
    }

    @Test
    void t2() {
        int[] arr = {2, 3, 1, 1, 4};
        Assertions.assertEquals(3, solution.oddEvenJumps(arr));
    }

    @Test
    void t3() {
        int[] arr = {5, 1, 3, 4, 2};
        Assertions.assertEquals(3, solution.oddEvenJumps(arr));
    }
}
