package com.raphael.lc.p654;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-14 06:55:33
 */
class ConstructMaximumBinaryTreeTest {

    private final ConstructMaximumBinaryTree solution = new ConstructMaximumBinaryTree();

    @Test
    void t1() {
        int[] nums = {3, 2, 1, 6, 0, 5};
        TreeNode root = TreeNode.build("[6,3,5,null,2,0,null,null,1]");
        Assertions.assertEquals(root, solution.constructMaximumBinarayTree(nums));
    }

    @Test
    void t2() {
        int[] nums = {3, 2, 1};
        TreeNode root = TreeNode.build("[3,null,2,null,1]");
        Assertions.assertEquals(root, solution.constructMaximumBinarayTree(nums));
    }
}
