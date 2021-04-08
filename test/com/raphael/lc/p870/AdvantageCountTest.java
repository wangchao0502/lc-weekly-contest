package com.raphael.lc.p870;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-08 11:31:39
 */
class AdvantageCountTest {

    private final AdvantageCount solution = new AdvantageCount();

    @Test
    void t1() {
        int[] a = {2, 7, 11, 15};
        int[] b = {1, 10, 4, 11};
        int[] ans = {2, 11, 7, 15};
        Assertions.assertArrayEquals(ans, solution.advantageCount(a, b));
    }

    @Test
    void t2() {
        int[] a = {12, 24, 8, 32};
        int[] b = {13, 25, 32, 11};
        int[] ans = {24, 32, 8, 12};
        Assertions.assertArrayEquals(ans, solution.advantageCount(a, b));
    }
}
