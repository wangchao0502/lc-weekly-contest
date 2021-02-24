package com.raphael.lc.p257;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-02-24 18:58:38
 */
class BinaryTreePathsTest {

    private final BinaryTreePaths solution = new BinaryTreePaths();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,2,3,null,5]");
        List<String> result = Arrays.asList("1->2->5", "1->3");
        Assertions.assertEquals(result, solution.binaryTreePaths(root));
    }
}
