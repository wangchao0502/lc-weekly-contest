package com.raphael.lc.p554;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-02 09:54:48
 */
class LeastBricksTest {

    private final LeastBricks solution = new LeastBricks();

    @Test
    void t1() {
        List<List<Integer>> wall = new ArrayList<>();
        wall.add(Arrays.asList(1, 2, 2, 1));
        wall.add(Arrays.asList(3, 1, 2));
        wall.add(Arrays.asList(1, 3, 2));
        wall.add(Arrays.asList(2, 4));
        wall.add(Arrays.asList(3, 1, 2));
        Assertions.assertEquals(2, solution.leastBricks(wall));
    }

    @Test
    void t2() {
        List<List<Integer>> wall = new ArrayList<>();
        wall.add(Collections.singletonList(1));
        wall.add(Collections.singletonList(1));
        wall.add(Collections.singletonList(1));
        Assertions.assertEquals(3, solution.leastBricks(wall));
    }
}
