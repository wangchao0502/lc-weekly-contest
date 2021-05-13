package com.raphael.lc.p572;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-12 15:42:06
 */
class IsSubtreeTest {

    private final IsSubtree solution = new IsSubtree();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[3,4,5,1,2]");
        TreeNode sub = TreeNode.build("[4,1,2]");
        Assertions.assertTrue(solution.isSubtree(root, sub));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[3,4,5,1,2,null,null,null,null,0]");
        TreeNode sub = TreeNode.build("[4,1,2]");
        Assertions.assertFalse(solution.isSubtree(root, sub));
    }
}
