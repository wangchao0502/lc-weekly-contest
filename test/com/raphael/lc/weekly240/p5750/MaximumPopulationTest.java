package com.raphael.lc.weekly240.p5750;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-09 10:47:16
 */
class MaximumPopulationTest {

    private final MaximumPopulation solution = new MaximumPopulation();

    @Test
    void t1() {
        int[][] logs = {{1993, 1999}, {2000, 2010}};
        Assertions.assertEquals(1993, solution.maximumPopulation(logs));
    }

    @Test
    void t2() {
        int[][] logs = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        Assertions.assertEquals(1960, solution.maximumPopulation(logs));
    }
}
