package com.raphael.lc.p513;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-10 13:18:55
 */
class FindBottomLeftValueTest {

    private final FindBottomLeftValue solution = new FindBottomLeftValue();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[2,1,3]");
        Assertions.assertEquals(1, solution.findBottomLeftValue(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[1,2,3,4,null,5,6,null,null,7]");
        Assertions.assertEquals(7, solution.findBottomLeftValue(root));
    }
}
