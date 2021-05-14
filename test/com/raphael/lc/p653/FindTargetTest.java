package com.raphael.lc.p653;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-14 06:44:48
 */
class FindTargetTest {

    private final FindTarget solution = new FindTarget();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[5,3,6,2,4,null,7]");
        Assertions.assertTrue(solution.findTarget(root, 9));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[5,3,6,2,4,null,7]");
        Assertions.assertFalse(solution.findTarget(root, 28));
    }
}
