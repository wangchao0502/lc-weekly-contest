package com.raphael.lc.p655;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-14 11:31:07
 */
class PrintTreeTest {

    private final PrintTree solution = new PrintTree();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,2]");
        List<List<String>> ans = new ArrayList<>();
        ans.add(Arrays.asList("", "1", ""));
        ans.add(Arrays.asList("2", "", ""));
        Assertions.assertEquals(ans, solution.printTree(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[1,2,3,null,4]");
        List<List<String>> ans = new ArrayList<>();
        ans.add(Arrays.asList("", "", "", "1", "", "", ""));
        ans.add(Arrays.asList("", "2", "", "", "", "3", ""));
        ans.add(Arrays.asList("", "", "4", "", "", "", ""));
        Assertions.assertEquals(ans, solution.printTree(root));
    }
}
