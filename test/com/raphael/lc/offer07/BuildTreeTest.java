package com.raphael.lc.offer07;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-09 14:18:50
 */
class BuildTreeTest {

    private final BuildTree solution = new BuildTree();

    @Test
    void t1() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode tree = TreeNode.build("[3,9,20,null,null,15,7]");
        Assertions.assertEquals(tree, solution.buildTree(preorder, inorder));
    }
}
