package com.raphael.lc.p724;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-28 21:50:54
 */
class PivotIndexTest {

    private final PivotIndex solution = new PivotIndex();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}
