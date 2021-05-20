package com.raphael.lc.p889;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-20 11:48:07
 */
class ConstructFromPrePostTest {

    private final ConstructFromPrePost solution = new ConstructFromPrePost();

    @Test
    void t1() {
        int[] pre = {1, 2, 4, 5, 3, 6, 7};
        int[] post = {4, 5, 2, 6, 7, 3, 1};
        TreeNode root = TreeNode.build("[1,2,3,4,5,6,7]");
        Assertions.assertEquals(root, solution.constructFromPrePost(pre, post));
    }
}
