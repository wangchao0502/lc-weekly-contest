package com.raphael.lc.offer32;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-16 17:41:22
 */
class LevelOrderTest {

    private final LevelOrder solution = new LevelOrder();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[3,9,20,null,null,15,7]");
        int[] ans = {3, 9, 20, 15, 7};
        Assertions.assertArrayEquals(ans, solution.levelOrder(root));
    }
}
