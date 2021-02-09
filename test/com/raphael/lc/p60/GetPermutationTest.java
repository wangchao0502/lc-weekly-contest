package com.raphael.lc.p60;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-09 15:19:18
 */
class GetPermutationTest {

    private final GetPermutation solution = new GetPermutation();

    @Test
    void t1() {
        Assertions.assertEquals("213", solution.getPermutation(3, 3));
    }
}
