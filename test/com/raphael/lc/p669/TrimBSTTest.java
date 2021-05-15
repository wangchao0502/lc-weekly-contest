package com.raphael.lc.p669;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-15 16:29:53
 */
class TrimBSTTest {

    private final TrimBST solution = new TrimBST();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,0,2]");
        TreeNode ans = TreeNode.build("[1,null,2]");
        Assertions.assertEquals(ans, solution.trimBST(root, 1, 2));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[3,0,4,null,2,null,null,1]");
        TreeNode ans = TreeNode.build("[3,2,null,1]");
        Assertions.assertEquals(ans, solution.trimBST(root, 1, 3));
    }
}
