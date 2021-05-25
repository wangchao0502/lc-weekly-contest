package com.raphael.lc.p1313;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-25 12:51:31
 */
class DecompressRLElistTest {

    private final DecompressRLElist solution = new DecompressRLElist();

    @Test
    void t1() {
        int[] nums = {1, 2, 3, 4};
        int[] ans = {2, 4, 4, 4};
        Assertions.assertArrayEquals(ans, solution.decompressRLElist(nums));
    }

    @Test
    void t2() {
        int[] nums = {1, 1, 2, 3};
        int[] ans = {1, 3, 3};
        Assertions.assertArrayEquals(ans, solution.decompressRLElist(nums));
    }
}
