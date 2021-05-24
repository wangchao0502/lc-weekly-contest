package com.raphael.lc.p968;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-24 10:12:11
 */
class MinCameraCoverTest {

    private final MinCameraCover solution = new MinCameraCover();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[0,0,null,0,null,0,null,null,0]");
        Assertions.assertEquals(2, solution.minCameraCover(root));
    }
}
