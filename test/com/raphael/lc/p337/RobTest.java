package com.raphael.lc.p337;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-06 13:47:14
 */
class RobTest {

    private final Rob solution = new Rob();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[3,2,3,null,3,null,1]");
        Assertions.assertEquals(7, solution.rob(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[3,4,5,1,3,null,1]");
        Assertions.assertEquals(9, solution.rob(root));
    }
}
