package com.raphael.lc.p987;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-26 10:31:33
 */
class VerticalTraversalTest {

    private final VerticalTraversal solution = new VerticalTraversal();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[3,9,20,null,null,15,7]");
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Collections.singletonList(9));
        ans.add(Arrays.asList(3, 15));
        ans.add(Collections.singletonList(20));
        ans.add(Collections.singletonList(7));
        Assertions.assertEquals(ans, solution.verticalTraversal(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[1,2,3,4,5,6,7]");
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Collections.singletonList(4));
        ans.add(Collections.singletonList(2));
        ans.add(Arrays.asList(1, 5, 6));
        ans.add(Collections.singletonList(3));
        ans.add(Collections.singletonList(7));
        Assertions.assertEquals(ans, solution.verticalTraversal(root));
    }
}
