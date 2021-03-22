package com.raphael.lc.offer55;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-22 11:26:52
 */
class MaxDepthTest {

    private final MaxDepth solution = new MaxDepth();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[3,9,20,null,null,15,7]");
        Assertions.assertEquals(3, solution.maxDepth(root));
    }
}
