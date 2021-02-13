package com.raphael.lc.p398;

import com.raphael.lc.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-13 20:13:54
 */
class SolutionTest {
    @Test
    void t1() {
        int[] nums = {1,2,3,3,3};
        Solution solution = new Solution(nums);
        System.out.println(solution.pick(3));
    }
}
