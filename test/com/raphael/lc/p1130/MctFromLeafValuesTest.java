package com.raphael.lc.p1130;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-31 12:55:54
 */
class MctFromLeafValuesTest {

    private final MctFromLeafValues solution = new MctFromLeafValues();

    @Test
    void t1() {
        int[] arr = {6, 2, 4};
        Assertions.assertEquals(32, solution.mctFromLeafValues(arr));
    }
}
