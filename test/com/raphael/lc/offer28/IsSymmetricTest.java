package com.raphael.lc.offer28;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-16 14:44:43
 */
class IsSymmetricTest {

    private final IsSymmetric solution = new IsSymmetric();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,2,2,3,4,4,3]");
        Assertions.assertTrue(solution.isSymmetric(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[1,2,2,null,3,null,3]");
        Assertions.assertFalse(solution.isSymmetric(root));
    }
}
