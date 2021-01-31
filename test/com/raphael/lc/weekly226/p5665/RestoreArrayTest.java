package com.raphael.lc.weekly226.p5665;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-31 10:41:39
 */
class RestoreArrayTest {

    private final RestoreArray solution = new RestoreArray();

    @Test
    void t1() {
        int[][] input = {{2, 1}, {3, 4}, {3, 2}};
        Assertions.assertArrayEquals(new int[]{4, 3, 2, 1}, solution.restoreArray(input));
    }
}
