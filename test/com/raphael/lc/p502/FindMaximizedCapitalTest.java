package com.raphael.lc.p502;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-13 15:53:14
 */
class FindMaximizedCapitalTest {

    private final FindMaximizedCapital solution = new FindMaximizedCapital();

    @Test
    void t1() {
        int[] profits = {1, 2, 3};
        int[] capital = {0, 1, 1};
        Assertions.assertEquals(4, solution.findMaximizedCapital(2, 0, profits, capital));
    }
}
