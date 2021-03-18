package com.raphael.lc.offer40;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-17 11:56:44
 */
class GetLeastNumbersTest {

    private final GetLeastNumbers solution = new GetLeastNumbers();

    @Test
    void t1() {
        int[] arr = {3, 2, 1};
        int[] ans = {2, 1};
        Assertions.assertArrayEquals(ans, solution.getLeastNumbers(arr, 2));
    }

    @Test
    void t2() {
        int[] arr = {4, 5, 6, 7, 9, 3, 2, 1};
        int[] ans = {2, 1};
        Assertions.assertArrayEquals(ans, solution.getLeastNumbers(arr, 2));
    }
}
