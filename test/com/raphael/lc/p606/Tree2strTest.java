package com.raphael.lc.p606;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-12 16:02:49
 */
class Tree2strTest {

    private final Tree2str solution = new Tree2str();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,2,3,4]");
        Assertions.assertEquals("1(2(4))(3)", solution.tree2str(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[1,2,3,null,4]");
        Assertions.assertEquals("1(2()(4))(3)", solution.tree2str(root));
    }

    @Test
    void t3() {
        TreeNode root = TreeNode.build("[-1,-2,null,-3,null,-4]");
        Assertions.assertEquals("-1(-2(-3(-4)))", solution.tree2str(root));
    }
}
