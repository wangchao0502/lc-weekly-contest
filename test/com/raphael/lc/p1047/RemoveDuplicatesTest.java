package com.raphael.lc.p1047;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-09 13:47:33
 */
class RemoveDuplicatesTest {

    private final RemoveDuplicates solution = new RemoveDuplicates();

    @Test
    void t1() {
        Assertions.assertEquals("ca", solution.removeDuplicates("abbaca"));
    }
}
