package com.raphael.lc.p958;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-22 10:49:46
 */
class IsCompletTreeTest {

    private final IsCompletTree solution = new IsCompletTree();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,2,3,4,5,6]");
        Assertions.assertTrue(solution.isCompletTree(root));
    }
}
