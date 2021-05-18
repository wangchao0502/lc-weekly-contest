package com.raphael.lc.p687;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-18 12:13:35
 */
class LongestUnivaluePathTest {

    private final LongestUnivaluePath solution = new LongestUnivaluePath();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[5,4,5,1,1,null,5]");
        Assertions.assertEquals(2, solution.longestUnivaluePath(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[1,4,5,4,4,null,5]");
        Assertions.assertEquals(2, solution.longestUnivaluePath(root));
    }
}
