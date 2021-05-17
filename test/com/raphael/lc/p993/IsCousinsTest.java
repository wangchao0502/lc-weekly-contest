package com.raphael.lc.p993;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-17 10:49:23
 */
class IsCousinsTest {

    private final IsCousins solution = new IsCousins();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,2,3,4]");
        Assertions.assertFalse(solution.isCousins(root, 4, 3));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[1,2,3,null,4,null,5]");
        Assertions.assertTrue(solution.isCousins(root, 5, 4));
    }

    @Test
    void t3() {
        TreeNode root = TreeNode.build("[1,2,3,null,4]");
        Assertions.assertFalse(solution.isCousins(root, 2, 3));
    }
}
