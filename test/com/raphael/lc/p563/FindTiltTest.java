package com.raphael.lc.p563;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-11 10:14:19
 */
class FindTiltTest {

    private final FindTilt solution = new FindTilt();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,2,3]");
        Assertions.assertEquals(1, solution.findTilt(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[4,2,9,3,5,null,7]");
        Assertions.assertEquals(15, solution.findTilt(root));
    }
}
