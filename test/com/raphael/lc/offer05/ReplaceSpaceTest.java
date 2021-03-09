package com.raphael.lc.offer05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-09 14:08:48
 */
class ReplaceSpaceTest {

    private final ReplaceSpace solution = new ReplaceSpace();

    @Test
    void t1() {
        Assertions.assertEquals("We%20are%20happy.", solution.replaceSpace("We are happy."));
    }
}
