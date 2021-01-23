package com.raphael.lc.p1319;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-23 18:32:54
 */
class MakeConnectedTest {

    private final MakeConnected solution = new MakeConnected();

    @Test
    void t1() {
        int[][] connections = {{0, 1}, {0, 2}, {1, 2}};
        Assertions.assertEquals(1, solution.makeConnected(4, connections));
    }

    @Test
    void t2() {
        int[][] connections = {{0, 1}, {0, 2}, {0, 3}, {1, 2}};
        Assertions.assertEquals(-1, solution.makeConnected(6, connections));
    }
}
