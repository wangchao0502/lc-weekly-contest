package com.raphael.lc.p989;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-22 00:47:10
 */
class AddToArrayFormTest {

    private final AddToArrayForm solution = new AddToArrayForm();

    @Test
    void t1() {
        int[] nums = new int[]{2, 1, 5};
        List<Integer> output = Arrays.asList(1, 0, 2, 1);
        Assertions.assertEquals(output, solution.addToArrayForm(nums, 806));
    }

    @Test
    void t2() {
        int[] nums = new int[]{0};
        List<Integer> output = Arrays.asList(2, 3);
        Assertions.assertEquals(output, solution.addToArrayForm(nums, 23));
    }
}

