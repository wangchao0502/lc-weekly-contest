package com.raphael.lc.p404;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-07 10:51:42
 */
class SumOfLeftLeavesTest {

    private final SumOfLeftLeaves solution = new SumOfLeftLeaves();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[3,9,20,null,null,15,7]");
        Assertions.assertEquals(24, solution.sumOfLeftLeaves(root));
    }
}
