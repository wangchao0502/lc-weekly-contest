package com.raphael.lc.p623;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-13 13:02:04
 */
class AddOneRowTest {

    private final AddOneRow solution = new AddOneRow();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[4,2,6,3,1,5]");
        TreeNode result = TreeNode.build("[4,1,1,2,null,null,6,3,1,5]");
        Assertions.assertEquals(result, solution.addOneRow(root, 1, 2));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[4,2,null,3,1]");
        TreeNode result = TreeNode.build("[4,2,null,1,1,3,null,null,1]");
        Assertions.assertEquals(result, solution.addOneRow(root, 1, 3));
    }

    @Test
    void t3() {
        TreeNode root = TreeNode.build("[4,2,6,3,1,5]");
        TreeNode result = TreeNode.build("[1,4,null,2,6,3,1,5]");
        Assertions.assertEquals(result, solution.addOneRow(root, 1, 1));
    }
}
