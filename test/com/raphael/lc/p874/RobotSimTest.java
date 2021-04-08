package com.raphael.lc.p874;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-08 11:57:29
 */
class RobotSimTest {

    private final RobotSim solution = new RobotSim();

    @Test
    void t1() {
        int[] commands = {4, -1, 3};
        int[][] obstacles = {};
        Assertions.assertEquals(25, solution.robotSim(commands, obstacles));
    }

    @Test
    void t2() {
        int[] commands = {4, -1, 4, -2, 4};
        int[][] obstacles = {{2, 4}};
        Assertions.assertEquals(65, solution.robotSim(commands, obstacles));
    }

    @Test
    void t3() {
        int[] commands = {-2, 8, 3, 7, -1};
        int[][] obstacles = {{-4, -1}, {1, -1}, {1, 4}, {5, 0}, {4, 5}, {-2, -1}, {2, -5}, {5, 1}, {-3, -1}, {5, -3}};
        Assertions.assertEquals(324, solution.robotSim(commands, obstacles));
    }
}
