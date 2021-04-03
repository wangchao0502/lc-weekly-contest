package com.raphael.lc.p1544;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-03 14:04:17
 */
class MakeGoodTest {

    private final MakeGood solution = new MakeGood();

    @Test
    void t1() {
        Assertions.assertEquals("leetcode", solution.makeGood("leEeetcode"));
    }

    @Test
    void t2() {
        Assertions.assertEquals("", solution.makeGood("abBAcC"));
    }

    @Test
    void t3() {
        Assertions.assertEquals("s", solution.makeGood("s"));
    }
}
