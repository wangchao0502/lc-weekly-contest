package com.raphael.lc.weekly239.p5747;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-02 10:39:06
 */
class SplitStringTest {

    private final SplitString solution = new SplitString();

    @Test
    void t1() {
        Assertions.assertFalse(solution.splitString("1234"));
    }

    @Test
    void t2() {
        Assertions.assertTrue(solution.splitString("050043"));
    }

    @Test
    void t3() {
        Assertions.assertFalse(solution.splitString("9080701"));
    }

    @Test
    void t4() {
        Assertions.assertTrue(solution.splitString("10009998"));
    }

    @Test
    void t5() {
        Assertions.assertTrue(solution.splitString("0095749573"));
    }

    @Test
    void t6() {
        Assertions.assertTrue(solution.splitString("0100"));
    }

    @Test
    void t7() {
        Assertions.assertFalse(solution.splitString("001"));
    }

    @Test
    void t8() {
        Assertions.assertTrue(solution.splitString("0090089"));
    }

    @Test
    void t9() {
        Assertions.assertFalse(solution.splitString("0166537080"));
    }

    @Test
    void t10() {
        Assertions.assertFalse(solution.splitString("000"));
    }

    @Test
    void t11() {
        Assertions.assertTrue(solution.splitString("22759227582275722756"));
    }
}
