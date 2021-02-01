package com.raphael.lc.p145;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author raphael
 * @date 2021-02-01 14:14:44
 */
class PostorderTraversalTest {

    private final PostorderTraversal solution = new PostorderTraversal();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,null,2,3]");
        Assertions.assertEquals(Arrays.asList(3, 2, 1), solution.postorderTraversal(root));
    }
}
