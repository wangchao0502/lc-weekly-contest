package com.raphael.lc.offer68;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-22 15:14:56
 */
class LowestCommonAncestorTest {

    private final LowestCommonAncestor solution = new LowestCommonAncestor();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[6,2,8,0,4,7,9,null,null,3,5]");
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        TreeNode result = new TreeNode(6);
        Assertions.assertEquals(result, solution.lowestCommonAncestor(root, p, q));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[6,2,8,0,4,7,9,null,null,3,5]");
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(4);
        TreeNode result = new TreeNode(2);
        Assertions.assertEquals(result, solution.lowestCommonAncestor(root, p, q));
    }
}
