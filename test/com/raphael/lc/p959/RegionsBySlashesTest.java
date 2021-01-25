package com.raphael.lc.p959;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-25 19:54:49
 */
class RegionsBySlashesTest {

    private final RegionsBySlashes solution = new RegionsBySlashes();

    @Test
    void t1() {
        String[] grid = {" /", "/ "};
        Assertions.assertEquals(2, solution.regionsBySlashes(grid));
    }

    @Test
    void t2() {
        String[] grid = {"\\/", "/\\"};
        Assertions.assertEquals(4, solution.regionsBySlashes(grid));
    }
}
