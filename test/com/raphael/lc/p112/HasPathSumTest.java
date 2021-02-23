package com.raphael.lc.p112;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-23 15:51:58
 */
class HasPathSumTest {

    private final HasPathSum solution = new HasPathSum();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[5,4,8,11,null,13,4,7,2,null,null,null,1]");
        Assertions.assertTrue(solution.hasPathSum(root, 22));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[1,2,3]");
        Assertions.assertFalse(solution.hasPathSum(root, 5));
    }

    @Test
    void t3() {
        TreeNode root = TreeNode.build("[1,2]");
        Assertions.assertFalse(solution.hasPathSum(root, 0));
    }

    @Test
    void t4() {
        TreeNode root = TreeNode.build("[]");
        Assertions.assertFalse(solution.hasPathSum(root, 0));
    }

    @Test
    void t5() {
        TreeNode root = TreeNode.build("[1,2]");
        Assertions.assertFalse(solution.hasPathSum(root, 1));
    }
}
