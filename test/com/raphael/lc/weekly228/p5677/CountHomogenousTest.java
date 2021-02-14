package com.raphael.lc.weekly228.p5677;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-14 10:41:37
 */
class CountHomogenousTest {

    private final CountHomogenous solution = new CountHomogenous();

    @Test
    void t1() {
        Assertions.assertEquals(13, solution.countHomogenous("abbcccaa"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(2, solution.countHomogenous("xy"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(15, solution.countHomogenous("zzzzz"));
    }

    @Test
    void t4() {
        Assertions.assertEquals(0, solution.countHomogenous(""));
    }
}
