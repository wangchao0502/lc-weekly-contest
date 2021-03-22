package com.raphael.lc.offer68;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-22 15:38:59
 */
class LowestCommonAncestor2Test {

    private final LowestCommonAncestor2 solution = new LowestCommonAncestor2();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[3,5,1,6,2,0,8,null,null,7,4]");
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);
        TreeNode result = new TreeNode(3);
        Assertions.assertEquals(result, solution.lowestCommonAncestor2(root, p, q));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[3,5,1,6,2,0,8,null,null,7,4]");
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(4);
        TreeNode result = new TreeNode(5);
        Assertions.assertEquals(result, solution.lowestCommonAncestor2(root, p, q));
    }
}
