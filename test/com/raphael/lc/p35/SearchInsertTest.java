package com.raphael.lc.p35;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-13 10:46:09
 */
class SearchInsertTest {

    private final SearchInsert solution = new SearchInsert();

    @Test
    void t1() {
        Assertions.assertEquals(2, solution.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    void t2() {
        Assertions.assertEquals(1, solution.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    void t3() {
        Assertions.assertEquals(4, solution.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    @Test
    void t4() {
        Assertions.assertEquals(0, solution.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}
