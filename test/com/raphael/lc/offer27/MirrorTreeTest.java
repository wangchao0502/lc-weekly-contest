package com.raphael.lc.offer27;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-16 14:36:05
 */
class MirrorTreeTest {

    private final MirrorTree solution = new MirrorTree();

    @Test
    void t1() {
        TreeNode node = TreeNode.build("[4,2,7,1,3,6,9]");
        TreeNode result = TreeNode.build("[4,7,2,9,6,3,1]");
        Assertions.assertEquals(result, solution.mirrorTree(node));
    }
}
