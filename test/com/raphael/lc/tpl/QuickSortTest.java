package com.raphael.lc.tpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-31 20:11:27
 */
class QuickSortTest {

    private final QuickSort solution = new QuickSort();

    @Test
    void t1() {
        int[] nums = {8, 5, 2, 7, 4, 3, 1, 6};
        solution.sort(nums);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, nums);
    }
}
