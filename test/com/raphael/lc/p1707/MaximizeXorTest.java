package com.raphael.lc.p1707;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-23 12:09:54
 */
class MaximizeXorTest {

    private final MaximizeXor solution = new MaximizeXor();

    @Test
    void t1() {
        int[] nums = {0, 1, 2, 3, 4};
        int[][] queries = {{3, 1}, {1, 3}, {5, 6}};
        int[] ans = {3, 3, 7};
        Assertions.assertArrayEquals(ans, solution.maximizeXor(nums, queries));
    }
}
