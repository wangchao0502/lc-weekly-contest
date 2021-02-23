package com.raphael.lc.p113;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-02-23 16:37:32
 */
class PathSumTest {

    private final PathSum solution = new PathSum();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[5,4,8,11,null,13,4,7,2,null,null,5,1]");
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(5, 4, 11, 2));
        result.add(Arrays.asList(5, 8, 4, 5));
        Assertions.assertEquals(result, solution.pathSum(root, 22));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[-2,null,-3]");
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(-2, -3));
        Assertions.assertEquals(result, solution.pathSum(root, -5));
    }
}
