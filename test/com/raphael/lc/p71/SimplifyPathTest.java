package com.raphael.lc.p71;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-01 13:37:58
 */
class SimplifyPathTest {

    private final SimplifyPath solution = new SimplifyPath();

    @Test
    void t1() {
        Assertions.assertEquals("/", solution.simplifyPath("/../"));
    }

    @Test
    void t2() {
        Assertions.assertEquals("/home", solution.simplifyPath("/home/"));
    }

    @Test
    void t3() {
        Assertions.assertEquals("/c", solution.simplifyPath("/a/./b/../../c/"));
    }
}
