package com.raphael.lc.p501;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-08 11:08:18
 */
class FindModeTest {

    private final FindMode solution = new FindMode();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,null,2,2]");
        int[] ans = {2};
        Assertions.assertArrayEquals(ans, solution.findMode(root));
    }
}
