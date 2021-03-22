package com.raphael.lc.offer67;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-22 15:00:20
 */
class StrToIntTest {

    private final StrToInt solution = new StrToInt();

    @Test
    void t1() {
        Assertions.assertEquals(42, solution.strToInt("42"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(-42, solution.strToInt("   -42"));
    }

    @Test
    void t3() {
        Assertions.assertEquals(4139, solution.strToInt("4139 with words"));
    }

    @Test
    void t4() {
        Assertions.assertEquals(0, solution.strToInt("words and 987"));
    }

    @Test
    void t5() {
        Assertions.assertEquals(-2147483648, solution.strToInt("-91283472332"));
    }

    @Test
    void t6() {
        Assertions.assertEquals(42, solution.strToInt("+42"));
    }
}
