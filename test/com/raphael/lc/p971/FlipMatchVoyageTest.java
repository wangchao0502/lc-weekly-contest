package com.raphael.lc.p971;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-26 09:37:39
 */
class FlipMatchVoyageTest {

    private final FlipMatchVoyage solution = new FlipMatchVoyage();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,2]");
        int[] voyage = {2, 1};
        List<Integer> ans = Collections.singletonList(-1);
        Assertions.assertEquals(ans, solution.flipMatchVoyage(root, voyage));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[1,2,3]");
        int[] voyage = {1, 3, 2};
        List<Integer> ans = Collections.singletonList(1);
        Assertions.assertEquals(ans, solution.flipMatchVoyage(root, voyage));
    }

    @Test
    void t3() {
        TreeNode root = TreeNode.build("[1,2,3]");
        int[] voyage = {1, 2, 3};
        List<Integer> ans = new ArrayList<>();
        Assertions.assertEquals(ans, solution.flipMatchVoyage(root, voyage));
    }
}
