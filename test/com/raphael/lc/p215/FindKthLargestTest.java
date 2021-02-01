package com.raphael.lc.p215;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-01 17:27:27
 */
class FindKthLargestTest {

    private final FindKthLargest solution = new FindKthLargest();

    @Test
    void t1() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        Assertions.assertEquals(4, solution.findKthLargest(nums, 4));
    }
}
