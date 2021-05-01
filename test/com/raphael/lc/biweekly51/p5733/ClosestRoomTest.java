package com.raphael.lc.biweekly51.p5733;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-01 23:24:19
 */
class ClosestRoomTest {

    private final ClosestRoom solution = new ClosestRoom();

    @Test
    void t1() {
        int[][] rooms = {{2, 2}, {1, 2}, {3, 2}};
        int[][] queries = {{3, 1}, {3, 3}, {5, 2}};
        int[] ans = {3, -1, 3};
        Assertions.assertArrayEquals(ans, solution.closestRoom(rooms, queries));
    }

    @Test
    void t2() {
        int[][] rooms = {{1, 4}, {2, 3}, {3, 5}, {4, 1}, {5, 2}};
        int[][] queries = {{2, 3}, {2, 4}, {2, 5}};
        int[] ans = {2, 1, 3};
        Assertions.assertArrayEquals(ans, solution.closestRoom(rooms, queries));
    }
}
