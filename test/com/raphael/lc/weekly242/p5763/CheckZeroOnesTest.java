package com.raphael.lc.weekly242.p5763;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-23 10:32:51
 */
class CheckZeroOnesTest {

    private final CheckZeroOnes solution = new CheckZeroOnes();

    @Test
    void t1() {
        Assertions.assertTrue(solution.checkZeroOnes("1101"));
    }

    @Test
    void t2() {
        Assertions.assertFalse(solution.checkZeroOnes("111000"));
    }

    @Test
    void t3() {
        Assertions.assertFalse(solution.checkZeroOnes("110100010"));
    }

    @Test
    void t4() {
        Assertions.assertTrue(solution.checkZeroOnes("1"));
    }
}
