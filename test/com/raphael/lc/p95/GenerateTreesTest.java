package com.raphael.lc.p95;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-10 11:23:10
 */
class GenerateTreesTest {

    private final GenerateTrees solution = new GenerateTrees();

    @Test
    void t1() {
        List<TreeNode> result = new ArrayList<>();
        result.add(TreeNode.build("[1,null,2,null,3]"));
        result.add(TreeNode.build("[1,null,3,2]"));
        result.add(TreeNode.build("[2,1,3]"));
        result.add(TreeNode.build("[3,1,null,null,2]"));
        result.add(TreeNode.build("[3,2,null,1]"));
        Assertions.assertEquals(result, solution.generateTrees(3));
    }
}
