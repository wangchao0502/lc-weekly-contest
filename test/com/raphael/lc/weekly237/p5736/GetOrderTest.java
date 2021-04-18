package com.raphael.lc.weekly237.p5736;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-18 10:39:31
 */
class GetOrderTest {

    private final GetOrder solution = new GetOrder();

    @Test
    void t1() {
        int[][] tasks = {{1, 2}, {2, 4}, {3, 2}, {4, 1}};
        int[] ans = {0, 2, 3, 1};
        Assertions.assertArrayEquals(ans, solution.getOrder(tasks));
    }

    @Test
    void t2() {
        int[][] tasks = {{7, 10}, {7, 12}, {7, 5}, {7, 4}, {7, 2}};
        int[] ans = {4, 3, 2, 0, 1};
        Assertions.assertArrayEquals(ans, solution.getOrder(tasks));
    }

    @Test
    void t3() {
        int[][] tasks = {{19, 13}, {16, 9}, {21, 10}, {32, 25}, {37, 4}, {49, 24}, {2, 15}, {38, 41}, {37, 34}, {33, 6}, {45, 4}, {18, 18}, {46, 39}, {12, 24}};
        int[] ans = {6, 1, 2, 9, 4, 10, 0, 11, 5, 13, 3, 8, 12, 7};
        Assertions.assertArrayEquals(ans, solution.getOrder(tasks));
    }

    @Test
    void t4() {
        int[][] tasks = {{1, 1}};
        int[] ans = {0};
        Assertions.assertArrayEquals(ans, solution.getOrder(tasks));
    }

    @Test
    void t5() {
        int[][] tasks = {{1, 1}, {10, 2}, {11, 1}};
        int[] ans = {0, 1, 2};
        Assertions.assertArrayEquals(ans, solution.getOrder(tasks));
    }
}
