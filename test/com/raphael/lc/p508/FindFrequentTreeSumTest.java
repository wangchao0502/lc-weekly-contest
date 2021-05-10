package com.raphael.lc.p508;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-10 12:38:52
 */
class FindFrequentTreeSumTest {

    private final FindFrequentTreeSum solution = new FindFrequentTreeSum();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[5,2,-3]");
        int[] ans = {2, -3, 4};
        Assertions.assertArrayEquals(ans, solution.findFrequentTreeSum(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[5,2,-5]");
        int[] ans = {2};
        Assertions.assertArrayEquals(ans, solution.findFrequentTreeSum(root));
    }
}
