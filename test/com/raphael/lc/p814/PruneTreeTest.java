package com.raphael.lc.p814;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-19 10:48:01
 */
class PruneTreeTest {

    private final PruneTree solution = new PruneTree();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,null,0,0,1]");
        TreeNode ans = TreeNode.build("[1,null,0,null,1]");
        Assertions.assertEquals(ans, solution.pruneTree(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[1,0,1,0,0,0,1]");
        TreeNode ans = TreeNode.build("[1,null,1,null,1]");
        Assertions.assertEquals(ans, solution.pruneTree(root));
    }

    @Test
    void t3() {
        TreeNode root = TreeNode.build("[1,1,0,1,1,0,1,0]");
        TreeNode ans = TreeNode.build("[1,1,0,1,1,null,1]");
        Assertions.assertEquals(ans, solution.pruneTree(root));
    }
}
