package com.raphael.lc.p1026;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-30 10:13:29
 */
class MaxAncestorDiffTest {

    private final MaxAncestorDiff solution = new MaxAncestorDiff();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[8,3,10,1,6,null,14,null,null,4,7,13]");
        Assertions.assertEquals(7, solution.maxAncestorDiff(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[1,null,2,null,0,3]");
        Assertions.assertEquals(3, solution.maxAncestorDiff(root));
    }
}
