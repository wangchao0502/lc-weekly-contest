package com.raphael.lc.p1373;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-08 16:35:50
 */
class MaxSumBSTTest {

    private final MaxSumBST solution = new MaxSumBST();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,4,3,2,4,2,5,null,null,null,null,null,null,4,6]");
        Assertions.assertEquals(20, solution.maxSumBST(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[4,3,null,1,2]");
        Assertions.assertEquals(2, solution.maxSumBST(root));
    }

    @Test
    void t3() {
        TreeNode root = TreeNode.build("[-4,-2,-5]");
        Assertions.assertEquals(0, solution.maxSumBST(root));
    }

    @Test
    void t4() {
        TreeNode root = TreeNode.build("[2,1,3]");
        Assertions.assertEquals(6, solution.maxSumBST(root));
    }

    @Test
    void t5() {
        TreeNode root = TreeNode.build("[5,4,8,3,null,6,3]");
        Assertions.assertEquals(7, solution.maxSumBST(root));
    }

    @Test
    void t6() {
        TreeNode root = TreeNode.build("[1,null,10,-5,20]");
        Assertions.assertEquals(25, solution.maxSumBST(root));
    }
}
