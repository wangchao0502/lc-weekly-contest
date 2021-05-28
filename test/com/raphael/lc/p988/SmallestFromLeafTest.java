package com.raphael.lc.p988;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-28 13:42:35
 */
class SmallestFromLeafTest {

    private final SmallestFromLeaf solution = new SmallestFromLeaf();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[0,1,2,3,4,3,4]");
        Assertions.assertEquals("dba", solution.smallestFromLeaf(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[25,1,3,1,3,0,2]");
        Assertions.assertEquals("adz", solution.smallestFromLeaf(root));
    }

    @Test
    void t3() {
        TreeNode root = TreeNode.build("[2,2,1,null,1,0,null,0]");
        Assertions.assertEquals("abc", solution.smallestFromLeaf(root));
    }
}
