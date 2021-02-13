package com.raphael.lc.p448;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-13 12:58:39
 */
class FindDisappearedNumbersTest {

    private final FindDisappearedNumbers solution = new FindDisappearedNumbers();

    @Test
    void t1() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = Arrays.asList(5, 6);
        Assertions.assertEquals(ans, solution.findDisappearedNumbers(nums));
    }
}
