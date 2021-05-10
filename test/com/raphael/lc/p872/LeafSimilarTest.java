package com.raphael.lc.p872;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-10 11:58:44
 */
class LeafSimilarTest {

    private final LeafSimilar solution = new LeafSimilar();

    @Test
    void t1() {
        TreeNode root1 = TreeNode.build("[3,5,1,6,2,9,8,null,null,7,4]");
        TreeNode root2 = TreeNode.build("[3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]");
        Assertions.assertTrue(solution.leafSimilar(root1, root2));
    }

    @Test
    void t2() {
        TreeNode root1 = TreeNode.build("[1]");
        TreeNode root2 = TreeNode.build("[1]");
        Assertions.assertTrue(solution.leafSimilar(root1, root2));
    }

    @Test
    void t3() {
        TreeNode root1 = TreeNode.build("[1]");
        TreeNode root2 = TreeNode.build("[2]");
        Assertions.assertFalse(solution.leafSimilar(root1, root2));
    }

    @Test
    void t4() {
        TreeNode root1 = TreeNode.build("[1,2]");
        TreeNode root2 = TreeNode.build("[2,2]");
        Assertions.assertTrue(solution.leafSimilar(root1, root2));
    }

    @Test
    void t5() {
        TreeNode root1 = TreeNode.build("[1,2,3]");
        TreeNode root2 = TreeNode.build("[1,3,2]");
        Assertions.assertFalse(solution.leafSimilar(root1, root2));
    }
}
