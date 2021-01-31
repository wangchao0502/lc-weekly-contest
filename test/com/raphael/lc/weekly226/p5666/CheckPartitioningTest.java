package com.raphael.lc.weekly226.p5666;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-31 11:36:50
 */
class CheckPartitioningTest {

    private final CheckPartitioning solution = new CheckPartitioning();

    @Test
    void t1() {
        Assertions.assertTrue(solution.checkPartitioning("abcbdd"));
    }

    @Test
    void t2() {
        Assertions.assertFalse(solution.checkPartitioning("bcbddxy"));
    }
}
