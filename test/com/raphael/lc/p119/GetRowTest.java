package com.raphael.lc.p119;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author raphael
 * @date 2021-02-12 11:56:42
 */
class GetRowTest {

    private final GetRow solution = new GetRow();

    @Test
    void t1() {
        Assertions.assertEquals(Arrays.asList(1, 3, 3, 1), solution.getRow(3));
    }
}
