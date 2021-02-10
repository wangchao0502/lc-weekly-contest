package com.raphael.lc.p96;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-10 13:37:41
 */
class NumTreesTest {

    private final NumTrees solution = new NumTrees();

    @Test
    void t1() {
        Assertions.assertEquals(5, solution.numTrees(3));
    }
}
