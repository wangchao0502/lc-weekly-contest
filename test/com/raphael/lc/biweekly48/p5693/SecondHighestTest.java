package com.raphael.lc.biweekly48.p5693;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-20 22:31:47
 */
class SecondHighestTest {

    private final SecondHighest solution = new SecondHighest();

    @Test
    void t1() {
        Assertions.assertEquals(2, solution.secondHighest("dfa12321afd"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(-1, solution.secondHighest("abc1111"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(0, solution.secondHighest("ck077"));
    }

    @Test
    void t4() {
        Assertions.assertEquals(8, solution.secondHighest("unqclirrea85188733589"));
    }
}
