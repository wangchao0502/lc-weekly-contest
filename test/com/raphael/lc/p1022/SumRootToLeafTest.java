package com.raphael.lc.p1022;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-29 14:10:47
 */
class SumRootToLeafTest {

    private final SumRootToLeaf solution = new SumRootToLeaf();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,0,1,0,1,0,1]");
        Assertions.assertEquals(22, solution.sumRootToLeaf(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[0]");
        Assertions.assertEquals(0, solution.sumRootToLeaf(root));
    }

    @Test
    void t3() {
        TreeNode root = TreeNode.build("[1,1]");
        Assertions.assertEquals(3, solution.sumRootToLeaf(root));
    }
}
