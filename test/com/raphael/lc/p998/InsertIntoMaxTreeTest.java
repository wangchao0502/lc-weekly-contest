package com.raphael.lc.p998;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-28 14:05:37
 */
class InsertIntoMaxTreeTest {

    private final InsertIntoMaxTree solution = new InsertIntoMaxTree();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[4,1,3,null,null,2]");
        TreeNode ans = TreeNode.build("[5,4,null,1,3,null,null,2]");
        Assertions.assertEquals(ans, solution.insertIntoMaxTree(root, 5));
    }
}
