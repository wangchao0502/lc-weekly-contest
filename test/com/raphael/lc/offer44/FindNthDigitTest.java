package com.raphael.lc.offer44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-19 12:10:51
 */
class FindNthDigitTest {

    private final FindNthDigit solution = new FindNthDigit();

    @Test
    void t1() {
        Assertions.assertEquals(3, solution.findNthDigit(3));
    }

    @Test
    void t2() {
        Assertions.assertEquals(0, solution.findNthDigit(11));
    }

    @Test
    void t3() {
        Assertions.assertEquals(7, solution.findNthDigit(10000));
    }

    @Test
    void t4() {
        Assertions.assertEquals(1, solution.findNthDigit(12));
    }
}
