package com.raphael.lc.p662;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-15 13:11:21
 */
class WidthOfBinaryTreeTest {

    private final WidthOfBinaryTree solution = new WidthOfBinaryTree();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,3,2,5,3,null,9]");
        Assertions.assertEquals(4, solution.widthOfBinaryTree(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[1,3,null,5,3]");
        Assertions.assertEquals(2, solution.widthOfBinaryTree(root));
    }

    @Test
    void t3() {
        TreeNode root = TreeNode.build("[1,3,2,5]");
        Assertions.assertEquals(2, solution.widthOfBinaryTree(root));
    }

    @Test
    void t4() {
        TreeNode root = TreeNode.build("[1,3,2,5,null,null,9,6,null,null,7]");
        Assertions.assertEquals(8, solution.widthOfBinaryTree(root));
    }
}
