package com.raphael.lc.p515;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-11 10:07:46
 */
class LargestValuesTest {

    private final LargestValues solution = new LargestValues();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,3,2,5,3,null,9]");
        List<Integer> ans = Arrays.asList(1, 3, 9);
        Assertions.assertEquals(ans, solution.largestValues(root));
    }
}
