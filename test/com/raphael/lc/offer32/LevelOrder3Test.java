package com.raphael.lc.offer32;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-03-16 17:57:07
 */
class LevelOrder3Test {

    private final LevelOrder3 solution = new LevelOrder3();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[3,9,20,null,null,15,7]");
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(3));
        result.add(Arrays.asList(20, 9));
        result.add(Arrays.asList(15, 7));
        Assertions.assertEquals(result, solution.levelOrder3(root));
    }
}
