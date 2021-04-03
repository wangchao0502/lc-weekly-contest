package com.raphael.lc.p1541;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-03 13:20:22
 */
class MinInsertionsTest {

    private final MinInsertions solution = new MinInsertions();

    @Test
    void t1() {
        Assertions.assertEquals(1, solution.minInsertions("(()))"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(0, solution.minInsertions("())"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(3, solution.minInsertions("))())("));
    }

    @Test
    void t4() {
        Assertions.assertEquals(12, solution.minInsertions("(((((("));
    }

    @Test
    void t5() {
        Assertions.assertEquals(5, solution.minInsertions(")))))))"));
    }

    @Test
    void t6() {
        Assertions.assertEquals(4, solution.minInsertions("(()))(()))()())))"));
    }

    @Test
    void t7() {
        Assertions.assertEquals(0, solution.minInsertions("((())))))"));
    }

    @Test
    void t8() {
        Assertions.assertEquals(31, solution.minInsertions("(((()(()((())))(((()())))()())))(((()(()()((()()))"));
    }
}
