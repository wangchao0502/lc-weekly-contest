package com.raphael.lc.p701;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-19 10:34:11
 */
class InsertIntoBSTTest {

    private final InsertIntoBST solution = new InsertIntoBST();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[4,2,7,1,3]");
        TreeNode ans = TreeNode.build("[4,2,7,1,3,5]");
        Assertions.assertEquals(ans, solution.insertIntoBST(root, 5));
    }
}
