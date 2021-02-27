package com.raphael.lc.p114;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-24 16:45:13
 */
class FlattenTest {

    private final Flatten solution = new Flatten();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,2,5,3,4,null,6]");
        TreeNode result = TreeNode.build("[1,null,2,null,3,null,4,null,5,null,6]");
        solution.flatten(root);
        Assertions.assertEquals(result, root);
    }
}
