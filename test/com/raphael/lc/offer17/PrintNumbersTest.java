package com.raphael.lc.offer17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-15 11:17:30
 */
class PrintNumbersTest {

    private final PrintNumbers solution = new PrintNumbers();

    @Test
    void t1() {
        int[] ans = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assertions.assertArrayEquals(ans, solution.printNumbers(1));
    }
}
