package com.raphael.lc.p437;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-07 11:10:28
 */
class PathSumTest {

    private final PathSum solution = new PathSum();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[10,5,-3,3,2,null,11,3,-2,null,1]");
        Assertions.assertEquals(3, solution.pathSum(root, 8));
    }
}
