package com.raphael.lc.p111;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-23 15:35:32
 */
class MinDepthTest {

    private final MinDepth solution = new MinDepth();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[3,9,20,null,null,15,7]");
        Assertions.assertEquals(2, solution.minDepth(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[2,null,3,null,4,null,5,null,6]");
        Assertions.assertEquals(5, solution.minDepth(root));
    }
}
