package com.raphael.lc.p110;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-22 16:48:36
 */
class IsBalancedTest {

    private final IsBalanced solution = new IsBalanced();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[3,9,20,null,null,15,7]");
        Assertions.assertTrue(solution.isBalanced(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[1,2,2,3,3,null,null,4,4]");
        Assertions.assertFalse(solution.isBalanced(root));
    }

    @Test
    void t3() {
        TreeNode root = TreeNode.build("[]");
        Assertions.assertTrue(solution.isBalanced(root));
    }

    @Test
    void t4() {
        TreeNode root = TreeNode.build("[1,2,2,3,null,null,3,4,null,null,4]");
        Assertions.assertFalse(solution.isBalanced(root));
    }
}
