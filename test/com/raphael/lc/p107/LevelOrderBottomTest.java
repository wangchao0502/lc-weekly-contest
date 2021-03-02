package com.raphael.lc.p107;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-02-22 16:38:09
 */
class LevelOrderBottomTest {

    private final LevelOrderBottom solution = new LevelOrderBottom();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[3,9,20,null,null,15,7]");
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(15,7));
        result.add(Arrays.asList(9,20));
        result.add(Collections.singletonList(3));
        Assertions.assertEquals(result, solution.levelOrderBottom(root));
    }
}
