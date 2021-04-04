package com.raphael.lc.weekly235.p5723;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-04 10:35:42
 */
class FindingUsersActiveMinutesTest {

    private final FindingUsersActiveMinutes solution = new FindingUsersActiveMinutes();

    @Test
    void t1() {
        int[][] logs = {{0, 5}, {1, 2}, {0, 2}, {0, 5}, {1, 3}};
        int[] result = {0, 2, 0, 0, 0};
        Assertions.assertArrayEquals(result, solution.findingUsersActiveMinutes(logs, 5));
    }

    @Test
    void t2() {
        int[][] logs = {{1, 1}, {2, 2}, {2, 3}};
        int[] result = {1, 1, 0, 0};
        Assertions.assertArrayEquals(result, solution.findingUsersActiveMinutes(logs, 4));
    }
}
