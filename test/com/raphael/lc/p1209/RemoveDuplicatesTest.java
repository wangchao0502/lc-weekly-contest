package com.raphael.lc.p1209;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-31 14:11:53
 */
class RemoveDuplicatesTest {

    private final RemoveDuplicates solution = new RemoveDuplicates();

    @Test
    void t1() {
        Assertions.assertEquals("abcd", solution.removeDuplicates("abcd", 2));
    }

    @Test
    void t2() {
        Assertions.assertEquals("aa", solution.removeDuplicates("deeedbbcccbdaa", 3));
    }

    @Test
    void t3() {
        Assertions.assertEquals("ps", solution.removeDuplicates("pbbcggttciiippooaais", 2));
    }
}
