package com.raphael.lc.p965;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-22 11:14:34
 */
class IsUnivalTreeTest {

    private final IsUnivalTree solution = new IsUnivalTree();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,1,1,1,1,null,1]");
        Assertions.assertTrue(solution.isUnivalTree(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[2,2,2,5,2]");
        Assertions.assertFalse(solution.isUnivalTree(root));
    }
}
