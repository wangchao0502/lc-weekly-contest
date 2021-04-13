package com.raphael.lc.p783;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-13 15:41:57
 */
class MinDiffInBSTTest {

    private final MinDiffInBST solution = new MinDiffInBST();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[4,2,6,1,3");
        Assertions.assertEquals(1, solution.minDiffInBST(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[1,0,48,null,null,12,49");
        Assertions.assertEquals(1, solution.minDiffInBST(root));
    }
}
