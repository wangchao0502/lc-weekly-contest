package com.raphael.lc.p450;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-08 10:31:00
 */
class DeleteNodeTest {

    private final DeleteNode solution = new DeleteNode();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[5,3,6,2,4,null,7]");
        TreeNode ans = TreeNode.build("[5,4,6,2,null,null,7]");
        Assertions.assertEquals(ans, solution.deleteNode(root, 3));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[5,3,6,2,4,null,7]");
        TreeNode ans = TreeNode.build("[5,3,6,2,4]");
        Assertions.assertEquals(ans, solution.deleteNode(root, 7));
    }

    @Test
    void t3() {
        TreeNode root = TreeNode.build("[4,null,7,6,8,5,null,null,9]");
        TreeNode ans = TreeNode.build("[4,null,8,6,9,5]");
        Assertions.assertEquals(ans, solution.deleteNode(root, 7));
    }
}
