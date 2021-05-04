package com.raphael.lc.p99;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-04 12:57:33
 */
class RecoverTreeTest {

    private final RecoverTree solution = new RecoverTree();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,3,null,null,2]");
        solution.recoverTree(root);
        TreeNode ans = TreeNode.build("[3,1,null,null,2]");
        Assertions.assertEquals(ans, root);
    }
}
