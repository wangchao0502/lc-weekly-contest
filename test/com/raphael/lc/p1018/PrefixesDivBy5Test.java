package com.raphael.lc.p1018;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-14 17:01:51
 */
class PrefixesDivBy5Test {

    private final PrefixesDivBy5 solution = new PrefixesDivBy5();

    @Test
    void t1() {
        List<Boolean> result = Arrays.asList(true, false, false);
        Assertions.assertEquals(result, solution.prefixesDivBy5(new int[]{0, 1, 1}));
    }

    @Test
    void t2() {
        List<Boolean> result = Arrays.asList(true, false, false, false, true, false);
        Assertions.assertEquals(result, solution.prefixesDivBy5(new int[]{0, 1, 1, 1, 1, 1}));
    }

    @Test
    void t3() {
        int[] input = {1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0};
        List<Boolean> result = Arrays.asList(false, false, true, false, false, false, false, false, false, false, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, true, false, false, true, false, false, true, true, true, true, true, true, true, false, false, true, false, false, false, false, true, true);
        Assertions.assertEquals(result, solution.prefixesDivBy5(input));
    }
}
