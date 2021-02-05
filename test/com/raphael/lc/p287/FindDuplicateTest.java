package com.raphael.lc.p287;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-05 13:32:09
 */
class FindDuplicateTest {

    private final FindDuplicate solution = new FindDuplicate();

    @Test
    void t1() {
        Assertions.assertEquals(2, solution.findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }
}
